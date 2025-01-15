package a1128.Abstract2;


abstract class  Animal {
    public void eat(){
        System.out.println("This animal eats food");
    }
    //추상메소드
    public abstract void makeSound(); //중괄호 쓰면 안됨. - 상속받는 클래스에서 구현.
}

class Dog extends Animal{

    @Override // 오버라이드 = 재정의
    public void makeSound() {
        System.out.println("멍멍 왈왈");
    }
}
class Cat extends Animal{

    @Override // 구현했다면 생략가능. 알아보기 편하라고 넣음..
    public void makeSound() {
        System.out.println("냥냥 맑");
    }
    //Animal 이라는 추상클래스를 상속받은 구체클래스 Cat은
    //Animal에 있는 추상클래스 makeSound()를 override해서
    //반드시 구현해야 한다.
}

public class AbstractEX {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        // ***추상클래스는 객체를 만들지 못함.***

        //구체클래스의 객체를 생성
        // Dog dog = new Dog();
        // dog.eat();
        // dog.makeSound();

        Animal dog = new Dog(); //업캐스팅
        Animal cat = new Cat();

        dog.eat();
        dog.makeSound(); 
        // 자식클래스에 있는 메소드를 부모클래스(추상클래스)에서 추상메소드로 
        // 불러냈기 때문에 다운캐스팅 없이 사용 가능.
        cat.eat();
        cat.makeSound();
    }
}
