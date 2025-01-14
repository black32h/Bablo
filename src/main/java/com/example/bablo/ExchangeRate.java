package com.example.bablo;

// Клас для представлення курси валют
class ExchangeRate {

    private String r030; // Код валюти (ідентифікатор)
    private String txt; // Назва валюти
    private double rate; // Курс валюти
    private String cc; // Символ валюти (наприклад, USD, EUR)
    private String exchangedate; // Дата обміну валют

    // Геттери та сеттери для доступу до полів
    // Геттер для отримання коду валюти
    public String getR030() {
        return r030;
    }

    // Сеттер для встановлення коду валюти
    public void setR030(String r030) {
        this.r030 = r030;
    }

    // Геттер для отримання назви валюти
    public String getTxt() {
        return txt;
    }

    // Сеттер для встановлення назви валюти
    public void setTxt(String txt) {
        this.txt = txt;
    }

    // Геттер для отримання курсу валюти
    public double getRate() {
        return rate;
    }

    // Сеттер для встановлення курсу валюти
    public void setRate(double rate) {
        this.rate = rate;
    }

    // Геттер для отримання символу валюти
    public String getCc() {
        return cc;
    }

    // Сеттер для встановлення символу валюти
    public void setCc(String cc) {
        this.cc = cc;
    }

    // Геттер для отримання дати обміну
    public String getExchangedate() {
        return exchangedate;
    }

    // Сеттер для встановлення дати обміну
    public void setExchangedate(String exchangedate) {
        this.exchangedate = exchangedate;
    }
}
