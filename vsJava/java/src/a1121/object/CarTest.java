package a1121.object;

public class CarTest {
    public static void main(String[] args) {
        Car genesis = new Car("g80", "black", 1000);

        System.out.println("모델명 : " + genesis.model);
        System.out.println("색상 : " + genesis.color);
        System.out.println("가격(단위: 만 원) : " + genesis.model);

        genesis.powerOn();
        genesis.accelerate();
        genesis.stop();
    }
}
