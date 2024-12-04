package a1204.ramda;


interface Calculator1{
    int sum(int a, int b);
}

public class Function3 {
    public static void main(String[] args) {
        Calculator1 mc = Integer::sum;
        int result = mc.sum(3,4);
        System.out.println((result));
    }
}
