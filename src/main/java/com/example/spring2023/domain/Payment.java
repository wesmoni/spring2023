package com.example.spring2023.domain;

import lombok.Getter;

/**
 * Класс отвечает за оплату
 * */
public class Payment {

    @Getter
    private String type;

    @Getter
    private double amount;

    /**
     * Конструктор класса
     * */
    public Payment(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

}
