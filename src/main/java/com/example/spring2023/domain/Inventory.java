package com.example.spring2023.domain;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.*;

/**
 * Класс отвечает за учет товаров на складе и их доступность
 * */
public class Inventory {
    private Map<String, Integer> inventoryItems;

    /**
     * Констуктор класса
     * */
    public Inventory() {
        inventoryItems = new HashMap<>();
    }

    /**
     * Метод отвечает за добавление заданного количества товара в инвентарь и обновляет значение
     * */
    public void addItem(String item, int quantity) {
        if (inventoryItems.containsKey(item)) {
            int currentQuantity = inventoryItems.get(item);
            inventoryItems.put(item, currentQuantity + quantity);
        } else {
            inventoryItems.put(item, quantity);
        }
    }

    /**
     * Метод отвечает за удаление заданного количества товара из инвентаря и обновляет значение
     * */
    public void removeItem(String item, int quantity) {
        if (inventoryItems.containsKey(item)) {
            int currentQuantity = inventoryItems.get(item);
            if (currentQuantity >= quantity) {
                inventoryItems.put(item, currentQuantity - quantity);
                out.println(quantity + " " + item + "(s) removed from inventory.");
            } else {
                out.println("Insufficient quantity of " + item + " in inventory.");
            }
        } else {
            out.println("Item " + item + " not found in inventory.");
        }
    }

    /**
     * Метод отвечает за отображение содержимого инвентаря
     * */
    public void displayInventory() {
        out.println("Inventory:");
        for (String item : inventoryItems.keySet()) {
            int quantity = inventoryItems.get(item);
            out.println(item + ": " + quantity);
        }
    }
}
