package com.example.spring2023.domain;

import lombok.Getter;

import java.util.List;

/**
 * Класс отвечает за все, что связано с категориями
 * */
public class Categories {

    @Getter
    private int categoryID;

    @Getter
    private String categoryName;

    private List<String> categories;

    public Categories(String categoryName) {
    }

    /**
     * Метод реализует логику для проверки на существование категории в БД
     * */
    private boolean categoryExistsInDatabase(String category) {
        // дописать
        return true; // Пример реализации, всегда возвращает true
    }

    /**
     * Метод реализует логику для поиска категории
     * */
    public String searchCategory(String pageContent, String category) {

        String pageContentLowerCase = pageContent.toLowerCase();

        if (pageContentLowerCase.contains(category.toLowerCase())) {
            return "Категория '" + category + "' найдена на странице";
        } else {
            return "Категория '" + category + "' не найдена на странице";
        }
    }

    /**
     * Метод реализует логику для создания категории
     * */
    public void createCategory(String categoryName) {
        Categories category = new Categories(categoryName);
        categories.add(String.valueOf(category));
    }
}
