package com.example.spring2023.app;

import com.example.spring2023.domain.FileStorageException;

import java.io.File;
import java.io.IOException;

/**
 * Класс отвечает за хранение и управление файлами на локальном файловом хранилище.
 * */
public class LocalFileStorage implements FileStorage {
    private String storagePath;

    public LocalFileStorage(String storagePath) {
        this.storagePath = storagePath;
    }

    /**
     * Метод отвечает проверку файла на наличие.
     * */
    @Override
    public boolean isValidFile(File file) throws FileStorageException {
        // Проверяем, что файл существует и его размер не превышает 10 МБ
        if (file.exists() && file.length() <= 10 * 1024 * 1024) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Метод отвечает за загрузку изображения.
     * */
    @Override
    public void storeFile(File file, String fileName) throws FileStorageException {
        // Проверяем, что файл допустим для загрузки
        if (!isValidFile(file)) {
            throw new FileStorageException("Invalid file for storage");
        }

        // Создаем объект File для нового файла в хранилище
        File storedFile = new File(storagePath + File.separator + fileName);

        try {
            // Копируем содержимое исходного файла в новый файл в хранилище
            java.nio.file.Files.copy(file.toPath(), storedFile.toPath());
        } catch (IOException e) {
            throw new FileStorageException("Error storing file: " + e.getMessage());
        }
    }


}
