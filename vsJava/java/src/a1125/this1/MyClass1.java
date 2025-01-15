package a1125.this1;

public class MyClass1 {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        obj1.myMethod();
        MyClass obj2 = new MyClass();
        obj2.myMethod();
    }
}

class MyClass {
    int myVariable;

    public MyClass(int myVariable){
        this.myVariable = myVariable;
    }
    public MyClass(){
        this(0);
    }
    public void myMethod(){
        System.out.println("나의 숫자는"+this.myVariable);
    }
}

