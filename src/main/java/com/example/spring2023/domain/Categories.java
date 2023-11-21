package com.example.spring2023.domain;

import lombok.Getter;

/**
 * Класс отвечает за все, что связано с категориями
 * */
public class Categories {

    @Getter
    private int categoryID;

    @Getter
    private String categoryName;

    /**
     * Метод реализует логику для поиска категории
     * */
    public void searchCategory(){

    }

}
