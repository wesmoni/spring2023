package com.example.spring2023.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

/**
 * Класс отвечает (почти) за все, что связано с заказами
 * */
@Data
@Entity
@Table(name="Orders")
public class Orders {
    @Id
    @Getter
    private Long id;

    @Getter
    private Customers customer;

    @Getter
    private Products product;

    @Getter
    private String address;

    @Getter
    private String status;

    @Getter
    private Long amount;

    /**
     * Конструктор класса
     * */
    public Orders(Long id, Customers customer, Products product, String address) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.address = address;
    }

    /**
     * Конструктор класса
     * */
    public Orders(String s, String product_b, double v) {

    }

    /**
     * Метод отвечает за статус заказа
     * */
    private void setStatus(String status) {
        this.status = status;
    }


}
