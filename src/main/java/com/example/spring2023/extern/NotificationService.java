package com.example.spring2023.extern;

import org.apache.catalina.User;

import java.util.List;

import static java.lang.System.*;

public class NotificationService {
    private List<User> users;

    public NotificationService(java.util.List<User> users) {
        this.users = users;
    }

    public void sendNotification(String message) {
        for (User user : users) {
            out.println("Notification sent to user " + user.getName() + ": " + message);
        }
    }
}
