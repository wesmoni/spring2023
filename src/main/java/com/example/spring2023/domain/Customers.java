package com.example.spring2023.domain;

/**
 * Класс отвечает за управление информацией о покупателях
 * */
class Customers extends Users {

    /**
     * Конструктор класса
     * */
    public Customers(Long id, String email, String firstName, String lastName, String login, String password) {
        super(id, email, firstName, lastName, login, password);
    }
}
