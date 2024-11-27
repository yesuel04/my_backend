package a1127.Animal;

class Dog extends Animal{
    private String name;
        public Dog(String name, int age){
            super(name, age);
        }
        @Override
        public void sound() {
            System.out.println(name + "가 멍멍");
    }
    @Override
    public void move() {
        System.out.println(name + "가 네발로 걷는다");
    }
}
