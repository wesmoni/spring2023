package com.example.spring2023.domain;

public class SpecialOfferDiscount implements Discount {
    private double specialPrice;

    public SpecialOfferDiscount(double specialPrice) {
        this.specialPrice = specialPrice;
    }

    @Override
    public double apply(double originalPrice) {
        if (originalPrice > specialPrice) {
            return specialPrice;
        } else {
            return originalPrice;
        }
    }
}