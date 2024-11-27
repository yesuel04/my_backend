package a1127.Animal;

abstract class Animal{

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void sound();
    abstract void move();

    public void info(){
        System.out.println(this.getClass().getSimpleName()+" : "+name+", 나이 : "+age);
    }

}
