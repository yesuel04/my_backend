package a1125.person;

public class Person1 {
    private static int count;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;

        count++;
    }
}

class InnerPerson1 {
    Person1 person1 = new Person1("김하나", 27);
    Person1 person2 = new Person1("김둘", 25);
    Person1 person3 = new Person1("김셋", 23);
}
