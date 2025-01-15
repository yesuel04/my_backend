package a1127.downcasting;

public class DownCastingEx {
    public static void main(String[] args) {
        Parent parentRef = new Child();
        parentRef.show();
        if(parentRef instanceof Child){
            Child childRef = (Child) parentRef;
            childRef.childspecial();
        }else{
            System.out.println("다운캐스팅 실패");
        }
    }
}

class Parent {
    void show(){
        System.out.println("부모클래스 메서드");
    }   
}
class Child extends Parent{

    @Override
    void show() {
        System.out.println("자식클래스 메서드");
    }
    void childspecial(){
        System.out.println("자식특별한 메서드"); 
    }

}
