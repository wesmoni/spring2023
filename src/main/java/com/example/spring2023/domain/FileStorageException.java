package com.example.spring2023.domain;

/**
 * Класс отвечает за представление исключений, связанных с операциями хранения файлов.
 * */
public class FileStorageException extends Exception {

    /**
     * Метод за создание объекта исключения с заданным сообщением и указанием причины.
     * */
    public FileStorageException(String message) {
        super(message);
    }

    /**
     * Метод отвечает за создание объекта исключения с заданным сообщением об ошибке.
     * */
    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}