package a1129;

abstract class Animal{
    int a=10;
    abstract void cry();
}

class Cat extends Animal{

    @Override
    void cry() {
       System.out.println("먉");    
    }
}

class Dog extends Animal{

    @Override
    void cry() {
        System.out.println("멍멍");
    }

}

public class Ab1 {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성 불가.
        // Animal a = new Animal();

        Cat c = new Cat();
        Dog d = new Dog();
        c.cry();
        d.cry();

        Animal e = new Cat();
        Animal f = new Dog();
        e.cry();
        f.cry();
    }
}
