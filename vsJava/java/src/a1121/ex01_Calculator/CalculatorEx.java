package a1121.ex01_Calculator;

public class CalculatorEx {
    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
        int a =10;
        int b =5;
        double x = 10.25;
        double y = 5.4;

        int arr[] = {1,2,3,4,5};

        int plus = calculator.plus(a,b);
        int minus = calculator.minus(a,b);
        double multiple = calculator.multiple(x,y);
        double divide = calculator.divide(x,y);
        int sum = calculator.sum(arr);
        double avg = calculator.avg(arr);

        System.out.println("더하기 : " + plus);
        System.out.println("빼기 : " + minus);
        System.out.printf("곱하기 : %5.2f\n", multiple);
        System.out.printf("나누기 : %5.2f\n", divide);
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);

        //printf 형식 : %x.y(리터럴)
        // x : 양수 - 크기만큼 칸을 지정하고 오른쪽 정렬 (%5.2 - 칸이 5개 있는 것.)
        //     음수 - 크기만큼 칸을 지정하고 왼쪽 정렬
        // y : 지정한 크기만큼 소수점 아래 자리수를 표현(반올림)
        // %d 정수 / %f 실수 / %s 문자열
    }
}
