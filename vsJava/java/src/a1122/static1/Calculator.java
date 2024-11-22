package a1122.static1;

public class Calculator {
    static double pi = 3.14159;

    static int plus(int x, int y){
        return x+y;
    }

    static int minus(int x, int y){
        return x-y;
    }
}

class Cal {
    public static void main(String[] args) {
        double result1 = 10*10*Calculator.pi;
        int result2 = Calculator.plus(10,5);
        int result3 = Calculator.minus(10,5);

        System.out.println("result1 : "+result1);
        System.out.println("result2 : "+result2);
        System.out.println("result3 : "+result3);
    }
}
