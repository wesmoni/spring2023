package com.example.spring2023.app;

import com.example.spring2023.domain.Products;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс отвечает за автоматизацию работы классом Product
 * */
public class ProductService {
    private List<Products> productList;

    /**
     * Конструктор класса
     * */
    public ProductService(List<Products> productList) {
        this.productList = productList;
    }

    /**
     * Метод отвечает за добавление продукта
     * */
    public void addProduct(Products product) {
        productList.add(product);
    }

    /**
     * Метод отвечает за удаление продукта
     * */
    public void removeProduct(Products product) {
        productList.remove(product);
    }

    /**
     * Метод отвечает за поиск пнродукта по айди
     * */
    public Products getProductById(long productId) {
        for (Products product : productList) {
            if (product.getProductID() == productId) {
                return product;
            }
        }
        return null; // Return null if product is not found
    }

    public List<Products> getAllProducts() {
        return productList;
    }

    /**
     * Метод отвечает за поиск продукта по категории
     * */
    public List<Products> getProductsByCategory(String category) {
        List<Products> categoryProducts = new ArrayList<>();
        for (Products product : productList) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                categoryProducts.add(product);
            }
        }
        return categoryProducts;
    }

    //добавить методы и перестать писать на английском чтобы в буудщем не запутаться
}