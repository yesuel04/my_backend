package a1128;

//부모 클래스
class Animal{
    void makeSound(){
        System.out.println("some sound");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("woof");
    }
}

public class Casting1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Animal myAnimal = (Animal) myDog; // 업캐스팅 : Dog > Animal

        // 업캐스팅을 사용하여 부모 클래스의 메소드 호출
        myDog.makeSound();
        myAnimal.makeSound();
        // myAnimal.bark();

        // 다운캐스팅 : Animal > Dog
        // if(myAnimal instanceof Dog){ //부모가 자식 타입인지 확인
        //     Dog dog = (Dog) myAnimal;
        //     dog.bark();
        // }
        if(myAnimal instanceof Dog dog){
            dog.bark();
        }

    }
}
