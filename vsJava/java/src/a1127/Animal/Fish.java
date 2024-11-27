package a1127.Animal;

class Fish extends Animal{
    private String name;
        public Fish(String name, int age){
            super(name, age);
        }
        @Override
        public void sound() {
            System.out.println(name + "가 ...");
    }
    @Override
    public void move() {
        System.out.println(name + "가 지느러미를 이용해 헤엄친다.");
    }
}
