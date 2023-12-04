package com.example.spring2023.app;

import com.example.spring2023.domain.Discount;

import java.util.List;

public class DiscountManager {
    private List<Discount> discounts;

    public DiscountManager(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public void addDiscount(Discount discount) {
        discounts.add(discount);
    }

    public void removeDiscount(Discount discount) {
        discounts.remove(discount);
    }

    public double applyDiscounts(double originalPrice) {
        double discountedPrice = originalPrice;
        for (Discount discount : discounts) {
            discountedPrice = discount.apply(discountedPrice);
        }
        return discountedPrice;
    }
}