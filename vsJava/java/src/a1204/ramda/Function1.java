package a1204.ramda;


interface Calculator1{
    int sum(int a, int b);
}
class MyCalculator implements Calculator1{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}

public class Function1 {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        int result = mc.sum(3,4);
        System.out.println((result));
    }
}
