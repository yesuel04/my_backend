package a1203.coffee;

import java.util.Map;

public class Customer {

    private int orderName;
    private Map<String, Integer> coffeeOrder;
    private int money;
    
    public int getOrderName() {
        return orderName;
    }

    public int getMoney() {
        return money;
    }
    
    public void setMoney(int money) {
        this.money = money;
    }
    
    public Customer(int s) {
        orderName = s;
        this.money = 300000;
    }

    public void setCoffeeOrder(Map<String, Integer> coffeeOrder) {
        this.coffeeOrder = coffeeOrder;
    }
}
