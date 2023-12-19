package com.example.spring2023.app;

import com.example.spring2023.domain.Products;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Products> productList;

    public ProductService(List<Products> productList) {
        this.productList = productList;
    }

    public void addProduct(Products product) {
        productList.add(product);
    }

    public void removeProduct(Products product) {
        productList.remove(product);
    }

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

    public List<Products> getProductsByCategory(String category) {
        List<Products> categoryProducts = new ArrayList<>();
        for (Products product : productList) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                categoryProducts.add(product);
            }
        }
        return categoryProducts;
    }

    // Additional methods for product-related operations can be added as needed
}