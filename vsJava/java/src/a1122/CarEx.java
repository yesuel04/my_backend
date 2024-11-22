package a1122;

public class CarEx {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("하나11");
        Car c3 = new Car("둘22");

        c1.display();
        c2.display();
        c3.display();
        
    }
}

class Car {
    String model;
    String brand;

    Car() {
        this("알수없음", "알수없음2");
    }
    Car(String brand){
        this(brand, "뭐지");
    }

    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    void display(){
        System.out.println("모델 : " + model + ", 브랜드 : " + brand);
    }
    
}