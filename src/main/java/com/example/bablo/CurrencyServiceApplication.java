package com.example.bablo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

// Анотація для вказівки, що це головний клас для запуску Spring Boot додатку
@SpringBootApplication
// Анотація для активації Feign клієнтів для взаємодії з іншими сервісами через HTTP
@EnableFeignClients
public class CurrencyServiceApplication {
    // Головний метод для запуску Spring Boot додатку
    public static void main(String[] args) {
        // Запуск Spring Boot додатку
        SpringApplication.run(CurrencyServiceApplication.class, args);
    }
}



