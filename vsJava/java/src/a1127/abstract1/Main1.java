package a1127.abstract1;

// 추상클래스 정의
abstract class Animal{
    String name;

    public Animal(String name) {
        this.name = name;
    }
    public void sleep(){
        System.out.println(name + "가 잠을 잡니다.");
    }

    public abstract void sound();
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + "가 멍멍 짖습니다.");
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + "가 야옹 하고 웁니다.");
    }
}


public class Main1 {
    public static void main(String[] args) {
        // 추상클래스는 객체 생성 불가능.
        Animal dog = new Dog("강아지");
        Animal cat = new Dog("고양이");
        dog.sleep();
        dog.sound();
        cat.sleep();
        cat.sound();
    }
}