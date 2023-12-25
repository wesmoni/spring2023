package com.example.spring2023.domain;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * Класс отвечает за поставки. В данном случае он представляет собой сущность, которая имеет имя и список продуктов, которые он поставляет.
 * */
public class Supplier {
    private String name;
    private List<String> products;

    /**
     * Конструктор класса
     * */
    public Supplier(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    /**
     * Метод отвечает за добавление продукта в список поставок
     * */
    public void addProduct(String product) {
        products.add(product);
        out.println("Продукт " + product + " добавлен поставщиком " + name);
    }

    /**
     * Метод отвечает за удаление продукта из списка поставок
     * */
    public void removeProduct(String product) {
        if (products.contains(product)) {
            products.remove(product);
            out.println("Продукт " + product + " удален поставщиком " + name);
        } else {
            out.println("Продукт " + product + " не найден у поставщика " + name);
        }
    }

    /**
     * Метод отвечает за отображение всего списка поставок
     * */
    public void displayProducts() {
        out.println("Продукты поставщика " + name + ":");
        for (String product : products) {
            out.println(product);
        }
    }
}