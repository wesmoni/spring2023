package com.example.spring2023.app;

import com.example.spring2023.domain.FileStorageException;

import java.io.File;

/**
 * Класс отвечает за загрузку файлов.
 * */
public class FileUploader {
    private FileStorage fileStorage;

    public FileUploader(FileStorage fileStorage) {
        this.fileStorage = fileStorage;
    }

    /**
     * Метод отвечает за загрузку изображения.
     * */
    public void uploadProductImage(File file, String productId) {
        try {
            if (fileStorage.isValidFile(file)) {
                String fileName = generateFileName(file, productId);
                fileStorage.storeFile(file, fileName);
                // Дополнительные действия, например, обновление информации о продукте в базе данных с ссылкой на загруженное изображение
                // productRepository.updateProductImage(productId, fileName);
            } else {
                System.out.println("Ошибка: Недопустимый формат файла");
            }
        } catch (FileStorageException e) {
            System.out.println("Ошибка при загрузке файла: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    /**
     * Метод отвечает генерацию имени файла.
     * */
    private String generateFileName(File file, String productId) {
        String originalFileName = file.getName();
        String extension = originalFileName.substring(originalFileName.lastIndexOf("."));
        return "product_" + productId + "_image" + extension;
    }
}
