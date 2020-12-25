package ru.netology.attachment;

public class Product {
    private int amount;//целочисленное значение цены, умноженное на 100
    private int currency;//объект currency

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    String text;//строка с локализованной ценой и валютой

}
//Объект currency
//Объект currency, описывающий информацию о валюте, содержит следующие поля:
//id — идентификатор валюты;
//name — буквенное обозначение валюты;