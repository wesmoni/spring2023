package com.example.spring2023.domain;

public class PercentageDiscount implements Discount {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double apply(double originalPrice) {
        return originalPrice * (1 - percentage / 100);
    }
}