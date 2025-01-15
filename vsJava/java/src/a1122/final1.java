package a1122;

public class final1 {
    public static void main(String[] args) {
        Car1 c1 = new Car1("하나", "둘");
        c1.display();
        // c1.brand = "바꾸기";
        // c1.display();
        // final 필드는 재할당 불가능
    }
}
        
class Car1 {
    final String brand;
    final String model;
    // final : 객체마다 고유하지만 한번 초기화 후에는 변경할 수 없음.
    
    public Car1(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    void display(){
        System.out.println("Brand : "+brand+", Model : "+model);
    }
}
