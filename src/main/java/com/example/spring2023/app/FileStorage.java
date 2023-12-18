package com.example.spring2023.app;

import com.example.spring2023.domain.FileStorageException;

import java.io.File;

/**
 * Интерфейс определяет определяет, что должен уметь делать класс, который будет хранить файлы.
 * */
public interface FileStorage {
    boolean isValidFile(File file) throws FileStorageException;
    void storeFile(File file, String fileName) throws FileStorageException;
}
