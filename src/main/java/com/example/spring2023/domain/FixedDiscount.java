package com.example.spring2023.domain;

/**
 * Класс отвечает за фиксированную скидку
 * */
public class FixedDiscount implements Discount {
    private double amount;

    /**
     * Конструктор класса
     * */
    public FixedDiscount(double amount) {
        this.amount = amount;
    }

    /**
     * Класс отвечает за применение скидки
     * */
    @Override
    public double apply(double originalPrice) {
        if (originalPrice < 0) {
            throw new IllegalArgumentException("Original price cannot be negative");
        }
        return Math.max(0, originalPrice - amount);
    }
}
