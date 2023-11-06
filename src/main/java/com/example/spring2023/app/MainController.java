package com.example.spring2023.app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Класс управляет основной логикой всего приложения
 * */
@RestController
public class MainController {

    /**
     * Метод выводит сообщение для всех пользователей
     * */
    @GetMapping("/allUsers")
    public String allUsers(){
        return "hi everyone";
    }

    /**
     * Метод выводит сообщение для всех зарегестрированных пользователей
     * */
    @GetMapping("/registeredUsers")
    public String registeredUsers(){
        return "hi registered users";
    }

    /**
     * Метод выводит сообщение для пользователей с доступом уровня админ
     * */
    @GetMapping("/admin")
    public String admin(){
        return "hi admin";
    }

}
