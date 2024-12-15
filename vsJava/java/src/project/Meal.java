package project;

import java.time.LocalDate;

public class Meal {
    int year;
    int month;
    int day;
    String store;
    String menu;
    int price;

    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public String getStore() {
        return store;
    }
    public String getMenu() {
        return menu;
    }
    public int getPrice() {
        return price;
    }

    public Meal(int year, int month, int day, String store, String menu, int price) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.store = store;
        this.menu = menu;
        this.price = price;
    }

    LocalDate getDate() {
        return LocalDate.of(this.year, this.month, this.day);
    }
}
