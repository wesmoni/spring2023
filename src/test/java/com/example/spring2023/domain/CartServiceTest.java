package com.example.spring2023.domain;

import static org.mockito.Mockito.*;

import com.example.spring2023.app.ProductService;
import org.junit.jupiter.api.Test;

/**
 * Тест для ProductService
 * */
class CartServiceTest {

    @Test
    void testAddProductToCart() {
        // Создаем макеты объектов ProductService и CartRepository
        ProductService mockedProductService = mock(ProductService.class);
        CustomersCart mockedCartRepository = mock(CustomersCart.class);

        // Задаем ожидаемый результат при вызове метода getProductById(1L) у ProductService
        long product = new Products(1L, "Футболка", "Красная футболка с логотипом", 19.99);
        when(mockedProductService.getProductById(1L)).thenReturn(product);

        // Создаем экземпляр класса CartService с макетами сервиса и репозитория
        CustomersCart cartService = new CustomersCart(mockedProductService, mockedCartRepository);

        // Вызываем метод addProductToCart(1L, 2) и проверяем, что он вызывает нужные методы у репозитория
        cartService.addItemToCart(1L, 2);
        verify(mockedCartRepository).addItemToCart(product, 2);
    }
}
