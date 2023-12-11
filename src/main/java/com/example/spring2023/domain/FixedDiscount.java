package com.example.spring2023.domain;

public class FixedDiscount implements Discount {
    private double amount;

    public FixedDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double apply(double originalPrice) {
        if (originalPrice < 0) {
            throw new IllegalArgumentException("Original price cannot be negative");
        }
        return Math.max(0, originalPrice - amount);
    }
}
