package com.example.bablo;

// Клас для представлення запиту з діапазоном дат та валютою
class DateRangeRequest {

    private String startDate; // Стартова дата
    private String endDate; // Кінцева дата
    private String currency; // Валюта

    // Геттери та сеттери для доступу до полів
    // Геттер для отримання стартової дати
    public String getStartDate() {
        return startDate;
    }

    // Сеттер для встановлення стартової дати
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    // Геттер для отримання кінцевої дати
    public String getEndDate() {
        return endDate;
    }

    // Сеттер для встановлення кінцевої дати
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    // Геттер для отримання валюти
    public String getCurrency() {
        return currency;
    }

    // Сеттер для встановлення валюти
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
