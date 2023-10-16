package com.example.spring2023.app;

/**
 * Класс Users является суперклассом, наследуемым классами Customers и Sellers
 * */
class Users {

    int id;
    int phoneNumber;
    int birthDate;
    String username;
    String password;
    String email;
    String firstName;
    String lastName;
    String address;



    /**
     * Метод реализует логику для входа пользователя в учетную запись
     * */
    void logIn(){

    }

    /**
     * Метод реализует логику для выхода пользователя из учетной записи
     * */
    void logOut() {

    }

    /**
     * Метод реализует логику для проверки и подтверждения идентификации пользователя, сохранения его в базе данных
     * */
    void resetPassword() {

    }


}
