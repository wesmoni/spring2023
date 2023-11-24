package com.example.spring2023.app;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

/**
 * Класс отвечает за связь аудентификацию пользователей
 * */
public class UserAuthenticationService {
    private Map<String, String> users = new HashMap<>();

    /**
     * Метод отвечает за проверку на то, прошел ли пользователь аудентификацию
     * */
    public boolean authenticateUser(String login, String password) {
        if (users.containsKey(login)) {
            return users.get(login).equals(password);
        }
        return false;
    }

    /**
     * Метод отвечает за сохранение email в базе данных
     * */
    public void createUser(String login, String password, String email) {
        users.put(login, password);
    }

    /**
     * Метод отвечает за обновление пароля в базе данных
     * */
    public void updatePassword(String login, String newPassword) {
        if (users.containsKey(login)) {
            users.put(login, newPassword);
        }
    }

    /**
     * Метод отвечает за запрос на сброс пароля
     * */
    public void requestPasswordReset(String login) {
        String tempPassword = generateTemporaryPassword();
        sendTemporaryPasswordByEmail(login, tempPassword);
    }

    /**
     * Метод отвечает за генерацию временного пароля
     * */
    private String generateTemporaryPassword() {
        return "temp123"; // Пример временного пароля
    }

    /**
     * Метод отвечает за отправку временного пароля на email
     * */
    private void sendTemporaryPasswordByEmail(String login, String tempPassword) {
        out.println("Sending temporary password " + tempPassword + " to " + login);
    }
}
