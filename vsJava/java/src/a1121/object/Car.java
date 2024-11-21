package a1121.object;

public class Car {
    // 필드(속성) 선언
    public String model;
    public String color;
    public int price;

    // 생성자(객체의 선언 및 초기화 방법)
    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // 메서드(행위) 선언
    void powerOn() {
        System.out.println("시동을 켠다");
    }

    void accelerate() {
        System.out.println("앞으로 간다.");
    }

    void stop() {
        System.out.println("멈춘다.");
    }
}
