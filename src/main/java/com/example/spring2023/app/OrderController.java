package com.example.spring2023.app;

import com.example.spring2023.domain.Orders;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

/**
 * Контроллер класса Orders
 * */
@RestController
public class OrderController {
    /**
     * Метод отвечает за обрабоку создания заказа
     * */
    @PostMapping("/orders")
    public ResponseEntity<?> createOrder(@Valid @RequestBody Orders order, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ValidationErrorResponse errorResponse = new ValidationErrorResponse();
            errorResponse.setMessage("Ошибка валидации данных заказа");
            errorResponse.setErrors(bindingResult.getAllErrors().stream()
                    .map(error -> error.getDefaultMessage())
                    .collect(Collectors.toList()));

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }

        // Обработка создания заказа
        return ResponseEntity.ok().build();
    }
}
