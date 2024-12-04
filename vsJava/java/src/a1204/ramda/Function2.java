package a1204.ramda;


interface Calculator1{
    int sum(int a, int b);
}

public class Function2 {
    public static void main(String[] args) {
        Calculator1 mc = (int a, int b) -> a+b;
        int result = mc.sum(3,4);
        System.out.println((result));
    }
}
