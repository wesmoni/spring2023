package com.example.spring2023.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Класс отвечает за все, что связано с заказами
 * */
@Data
@Entity
@Table(name="ORDERS")
public class Orders {
    @Id
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Customers customer;

    @Getter
    @Setter
    private Products product;

    @Getter
    @Setter
    private String address;

    /**
     * Конструктор класса
     * */
    public Orders(Long id, Customers customer, Products product, String address) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.address = address;
    }
}
