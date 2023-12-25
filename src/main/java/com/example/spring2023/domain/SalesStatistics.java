package com.example.spring2023.domain;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.*;

/**
 * Класс отвечает за статистику продаж
 * */
public class SalesStatistics {
    private Map<String, Integer> salesData;

    /**
     * Конструктор класса
     * */
    public SalesStatistics() {
        this.salesData = new HashMap<>();
    }

    /**
     * Метод отвечакт за добавление продажи в статистику
     * */
    public void addSale(String product, int amount) {
        if (salesData.containsKey(product)) {
            int currentAmount = salesData.get(product);
            salesData.put(product, currentAmount + amount);
        } else {
            salesData.put(product, amount);
        }
    }

    /**
     * Метод отвечакт за получение всей статистики
     * */
    public int getTotalSales(String product) {
        return salesData.getOrDefault(product, 0);
    }

    /**
     * Метод отвечакт за выведение суммы продаж
     * */
    public void printSalesReport() {
        out.println("Sales Report:");
        for (Map.Entry<String, Integer> entry : salesData.entrySet()) {
            out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    /**
     * Метод отвечакт за получение общей суммы продаж по всем товарам
     * */
    public int getTotalSales() {
        int total = 0;
        for (int amount : salesData.values()) {
            total += amount;
        }
        return total;
    }
}