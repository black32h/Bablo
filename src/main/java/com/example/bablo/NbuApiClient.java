package com.example.bablo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

// Анотація для вказівки, що цей інтерфейс є Feign клієнтом для взаємодії з зовнішнім API
@FeignClient(name = "nbuApi", url = "https://bank.gov.ua")
interface NbuApiClient {

    // Метод для отримання курсу валют на конкретну дату
    @GetMapping("/NBUStatService/v1/statdirectory/exchange")
    List<ExchangeRate> getExchangeRate(@RequestParam("valcode") String currency, // Валюта для запиту
                                       @RequestParam("date") String date, // Дата для запиту
                                       @RequestParam("json") boolean json); // Параметр для вказівки формату відповіді

    // Метод для отримання курсів валют в заданому діапазоні дат
    @GetMapping("/NBUStatService/v1/statdirectory/exchange")
    List<ExchangeRate> getExchangeRatesInRange(@RequestParam Map<String, String> params); // Параметри запиту (наприклад, діапазон дат і валюта)
}
