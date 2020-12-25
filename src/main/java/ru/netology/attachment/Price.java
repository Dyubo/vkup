package ru.netology.attachment;

public class Price {
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private int amount;//цена товара в сотых долях единицы валюты
    // currency (object) — валюта. Объект, содержащий поля:
    //id (integer) — идентификатор валюты;
    //name(string) — обозначение валюты;
}
