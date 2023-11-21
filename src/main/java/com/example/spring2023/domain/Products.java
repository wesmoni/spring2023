package com.example.spring2023.domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.System.out;

/**
 * Класс отвечает за товары (модели), которые будут представлены на платформе
 * */
public class Products {

    @Getter
    int productID;

    @Getter
    String productName;

    @Getter
    private double price;

    @Getter
    private double rate;

    String productDescription;
    //??? productImage;
    //??? productUrl;

    @Getter
    private double productRating;

    private List<String> reviews;

    /**
     * Конструктор класса
     * */
    private Products(String productName, double price) {
        this.productName = productName;
        this.price = price;
        this.productRating = 0.0; // по умолчанию установим рейтинг продукта как 0
    }

    /**
     * Метод реализует логику для проверки того, существует ли уже такой ID товара
     * */
    private boolean checkIfProductIDExists(int productID) {
        Random random = new Random();
        int existingProductID = random.nextInt(10);
        return existingProductID == productID;
    }

    /**
     * Метод реализует логику для генерации ID товара
     * */
    private int SetProductID(int productID) {
        if (checkIfProductIDExists(productID)) {
            out.println("Ошибка: продукт с таким ID уже существует");
        } else {
            this.productID = productID;
            out.println("ID продукта успешно установлен: " + productID);
        }
        return productID;
    }

    /**
     * Метод реализует логику для добавления отзыва на элемент класса Product
     * */
    public void addReview(String review) {
        if (this.reviews == null) {
            this.reviews = new ArrayList<String>();
        }
        this.reviews.add(review);
    }

    /**
     * Метод реализует логику для выставления цены товара
     * */
    private void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Оно бесценно у вас нет столько деняк");
        }
        this.price = price;
    }

    /**
     * Метод реализует логику для выставления оценки за товар
     * */
    public double addRate(double rate) {
        if (rate >= 0 && rate <= 5) {
            this.rate = rate;
            out.println("Рейтинг успешно обновлен до " + rate);
        } else {
            out.println("Ошибка: оценка должна быть от 0 до 5");
        }
        return rate;   //добавить проверку на наличие заказа
    }

    /**
     * Метод реализует логику для поиска продукта
     * */
    public void searchProduct(){

    }

}
