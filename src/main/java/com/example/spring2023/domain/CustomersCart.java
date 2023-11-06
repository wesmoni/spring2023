package com.example.spring2023.domain;

import java.util.List;

/**
 * Класс отвечает за управление корзиной покупателя
 * */
public class CustomersCart {

    int cartID; //связать с айди покупателя

    /**
     * Лист продуктов в корзине покупателя
     * */
    private List<Products> cartItems;

    /**
     * Метод реализует логику добавления элемента класса Product в корзину
     * */
    public void addItemToCart(Products item) throws IllegalArgumentException {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }

        if (cartItems.contains(item)) {
            throw new IllegalArgumentException("Item is already in the cart");
        }
        cartItems.add(item);
    }

    /**
     * Метод реализует логику удаления элемента класса Product из корзины
     * */
    public void removeItemFromCart(Products item) throws IllegalArgumentException {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }

        if (!cartItems.contains(item)) {
            throw new IllegalArgumentException("Item is not in the cart");
        }

        cartItems.remove(item);
    }


    /**
     * Метод реализует логику для полной очистки корзины покупателя
     * */
    void clearCart() {
        cartItems.clear();
    }

}
