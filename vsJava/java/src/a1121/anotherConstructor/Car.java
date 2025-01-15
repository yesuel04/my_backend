package a1121.anotherConstructor;

public class Car {
    String company = "현대";
    String model;
    String color;
    int maxSpeed;

    Car(String model){
        this(model, "실버", 250);
    }
    
    Car(String model, String color) {
        this(model, color, 250);
    }
    
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
