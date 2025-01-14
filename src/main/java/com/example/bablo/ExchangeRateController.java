package com.example.bablo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

// Анотація для вказівки, що цей клас є REST-контролером
@RestController
// Вказуємо базовий шлях для запитів (всі методи контролера будуть починатися з "/exchange-rate")
@RequestMapping("/exchange-rate")
class ExchangeRateController {

    // Автоматичне впровадження залежності для NbuApiClient (клієнт для взаємодії з API НБУ)
    @Autowired
    private NbuApiClient nbuApiClient;

    // Метод для отримання поточного курсу валюти
    @GetMapping
    public ExchangeRate getTodayExchangeRate(@RequestParam String currency) {
        // Форматування поточної дати для запиту до API
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        // Отримання курсу валюти на сьогодні з NbuApiClient
        List<ExchangeRate> rates = nbuApiClient.getExchangeRate(currency, today, true);

        // Якщо курси не знайдені, викидаємо помилку 404
        if (rates.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Currency not found");
        }
        // Повертаємо перший знайдений курс
        return rates.get(0);
    }

    // Метод для отримання курсів валюти в заданому діапазоні дат
    @PostMapping("/range")
    public List<ExchangeRate> getExchangeRatesInRange(@RequestBody DateRangeRequest request) {
        // Формування параметрів для запиту в API
        Map<String, String> params = Map.of(
                "start", request.getStartDate(),
                "end", request.getEndDate(),
                "valcode", request.getCurrency(),
                "json", "true"
        );
        // Отримання курсів валюти за допомогою NbuApiClient
        return nbuApiClient.getExchangeRatesInRange(params);
    }
}
