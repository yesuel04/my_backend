package a1126.sec03;

class Parent {
    int x = 10;
    void show(){
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    int x = 20;
    void display(){
        System.out.println("X in child : " + x);
        System.out.println("X in parent : " + super.x);
        super.show();
    }
}

public class Main02 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}

// super()는 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출
// 부모 클래스의 기본 생성자가 없으면 자식 클래스에서 super()를 사용해
// 부모 클래스의 매개 변수를 받는 생성자를 명시적으로 호출 해야 합니다.
// super()는 자식 클래스의 생성자에서 첫번째로 호츌해야 합니다.