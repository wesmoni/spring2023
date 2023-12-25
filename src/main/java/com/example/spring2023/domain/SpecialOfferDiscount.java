package com.example.spring2023.domain;

/**
 * Класс отвечает за скидки аля "специальное предложение"
 * */
public class SpecialOfferDiscount implements Discount {
    private double specialPrice;

    /**
     * Конструктор класса
     * */
    public SpecialOfferDiscount(double specialPrice) {
        this.specialPrice = specialPrice;
    }

    /**
     * Метод отвечает за применение скидки
     * */
    @Override
    public double apply(double originalPrice) {
        if (originalPrice > specialPrice) {
            return specialPrice;
        } else {
            return originalPrice;
        }
    }
}