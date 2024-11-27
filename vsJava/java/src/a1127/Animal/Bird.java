package a1127.Animal;

class Bird extends Animal{
    private String name;
        public Bird(String name, int age){
            super(name, age);
        }
        @Override
        public void sound() {
            System.out.println(name + "가 짹짹");
    }
    @Override
    public void move() {
        System.out.println(name + "가 날개로 날아간다");
    }

}
