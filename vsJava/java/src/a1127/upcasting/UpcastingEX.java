package a1127.upcasting;

public class UpcastingEX {
    public static void main(String[] args) {
        Child childObj = new Child(); 
        Parent parentObj = new Parent();
        childObj.show();
        parentObj.show();
        Parent parentRef = (Parent) childObj;
        parentRef.show();
    }
}

class Parent {
    void show(){
        System.out.println("부모 클래스 메서드");
    }
}
class Child extends Parent{

    @Override
    void show() {
        System.out.println("자식 클래스 메서드");
    }
    void childspecial(){
        System.out.println("자식 특별한 메소드");
    }

}