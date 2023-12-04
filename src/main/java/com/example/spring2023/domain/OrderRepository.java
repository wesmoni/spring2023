package com.example.spring2023.domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

/**
 * Класс отвечает за запись заказов
 * */
public class OrderRepository {

    @Getter
    private List<Orders> orders;

    /**
     * Конструктор класса
     * */
    public OrderRepository() {
        this.orders = new ArrayList<>();
    }

    /**
     * Метод отвечает за добавление заказа
     * */
    public void addOrder(Orders order) {
        this.orders.add(order);
        out.println("Order added: " + order.getId());
    }

    /**
     * Метод отвечает за удаление заказа
     * */
    public void removeOrder(String orderId) {
        for (Orders order : orders) {
            if (order.getId().equals(orderId)) {
                this.orders.remove(order);
                out.println("Order removed: " + orderId);
                return;
            }
        }
        out.println("Order not found: " + orderId);
    }

    /**
     * Геттер листа ордерс
     * */
    public List<Orders> getAllOrders() {
        return this.orders;
    }

    /**
     * Метод отвечает за получение заказа по запросу по ID
     * */
    public Orders getOrderById(String orderId) {
        for (Orders order : orders) {
            if (order.getId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }

    /**
     * Конструктор класса
     * */
    public static void main(String[] args) {
        OrderRepository orderRepository = new OrderRepository();
        Orders order1 = new Orders("001", "Product A", 100.0);
        Orders order2 = new Orders("002", "Product B", 150.0);

        orderRepository.addOrder(order1);  // Выводит "Order added: 001"
        orderRepository.addOrder(order2);  // Выводит "Order added: 002"

        List<Orders> allOrders = orderRepository.getAllOrders();
        for (Orders order : allOrders) {
            out.println(order.getId() + " - " + order.getProduct() + " - " + order.getAmount());
        }

        Orders foundOrder = orderRepository.getOrderById("001");
        out.println(foundOrder.getProduct());  // Выводит "Product A"

        orderRepository.removeOrder("002");  // Выводит "Order removed: 002"
    }
}
