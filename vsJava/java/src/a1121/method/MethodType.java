package a1121.method;

public class MethodType {
    public String printName;
    public int printNumber;
    public double multiply;

    public MethodType() {
        
    }
    
    public MethodType(String printName, int printNumber, double multiply) {
        this.printName = printName;
        this.printNumber = printNumber;
        this.multiply = multiply;
    }

    public void printName() {
        System.out.println("홍길동");
    }
    
    public void printNumber() {
        System.out.println(10);
        // return 10;
    }

    public void multiply(double a, double b) {
        System.out.println(a*b);
    }



}
