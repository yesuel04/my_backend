package a1120.class1;

public class CarEx {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.company = "기아";
        c1.model = "SONATA";
        c1.color = "white";
        c1.maxSpeed = 500;
        c1.speed = 200;

        System.out.println("회사 : "+ c1.company);
        System.out.println("모델 : "+ c1.model);
        System.out.println("색상 : "+ c1.color);
        System.out.println("최대 : "+ c1.maxSpeed);
        System.out.println("속도 : "+ c1.speed);

        c1.speed = 60;
        System.out.println("수정 후 속도 : "+ c1.speed);

        Car c2 = new Car("현대", "제네시스", "실버", 200, 60);

        System.out.println("회사 : "+ c2.company);
        System.out.println("모델 : "+ c2.model);
        System.out.println("색상 : "+ c2.color);
        System.out.println("최대 : "+ c2.maxSpeed);
        System.out.println("속도 : "+ c2.speed);
    }
}
