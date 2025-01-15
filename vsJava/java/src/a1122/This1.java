package a1122;

public class This1 {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        person.display();
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
    void display(){
        System.out.println("name : "+this.name);

    }

    
}
