package a1115;

public class whileSum {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        while (a<=100) {
            sum += a;
            a++;
        }
        System.out.print(sum);
    }
}
