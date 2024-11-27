package a1127.number;

public class Number {
    public static void main(String[] args) {
        int a = 5;
        double b = 2.5;
        double result = a + b;
        System.out.println("결과 : "+result); //7.5

        double d= 9.99;
        int r = (int) Math.round(d);
        int t = (int) d;
        System.out.println("반올림값 : " + r); //10
        System.out.println("절삭 값 : " + t);  //9

    }
}
