package a1129.Interface1;

interface  Animal {
    public abstract void cry();
    
}

class Cat implements Animal{
    @Override
    public void cry() {
       System.out.println("먉");    
    }
}

class Dog implements Animal{
    @Override
    public void cry() {
        System.out.println("멍멍");
    }

}

public class InterFace1 {
    public static void main(String[] args) {
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
