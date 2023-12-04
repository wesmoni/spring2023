package com.example.spring2023.extern;

import org.apache.catalina.User;

import java.util.List;

import static java.lang.System.*;

/**
 * Класс отвечает за управление отправкой уведомлений
 * */
public class NotificationService {
    private List<User> users;

    /**
     * Конструктор класса
     * */
    public NotificationService(java.util.List<User> users) {
        this.users = users;
    }

    /**
     * Метод отвечает за отправку уведомлений пользователю
     * */
    public void sendNotification(String message) {
        for (User user : users) {
            out.println("Notification sent to user " + user.getName() + ": " + message);
        }
    }
}
