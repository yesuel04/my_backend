package project;

public class Meal {
    String day;
    String store;
    String menu;
    int price;
    
    public Meal(String day, String store, String menu, int price) {
        this.day = day;
        this.store = store;
        this.menu = menu;
        this.price = price;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public String getStore() {
        return store;
    }
    public void setStore(String store) {
        this.store = store;
    }
    public String getMenu() {
        return menu;
    }
    public void setMenu(String menu) {
        this.menu = menu;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Meal [day=" + day + ", store=" + store + ", menu=" + menu + ", price=" + price + "]";
    }

    public void printMeal() {
        System.out.printf("| %-6s | %-12s | %-13s | %-9d |\n", day, store, menu, price);
    }
}
