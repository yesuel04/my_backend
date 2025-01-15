package a1121.ex01_Calculator;

public class Calculator {
    public static void main(String[] args) {
        /*
 * 계산기
 * - 피연산자를 2개로 하는 계산기
 * - 기능
 * 		1. 덧셈	: 정수 2개를 덧셈
 * 		2. 뺄셈	: 정수 인자1 - 인자2 연산하는 뺄셈
 * 		3. 곱셈	: 실수 2개를 곱셈
 * 		4. 나눗셈	: 실수 인자1 / 인자2 연산하는 나눗셈
 * 		5. 나머지	: 실수 인자1 % 인자2 연산하는 나눗셈
 * 		6. 합계	: 배열을 매개변수로 전달받아, 모든 요소의 합을 구함
 * 		7. 평균	: 배열을 매개변수로 전달받아, 평균을 구함
 */
    }

    public int plus(int a, int b){
        int result1 = a+b;
        return result1;
    }

    public int minus(int a, int b){
        int result2 = a-b;
        return result2;
    }

    public double multiple(double x, double y) {
        double result3 = x*y;
        return result3;
    }

    public double divide(double x, double y) {
        double result4 = x/y;
        return result4;
    }

    public int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public double avg(int[] arr) {
        int sum = sum(arr);
        double avg = (double) sum / arr.length;
        return avg;
    }
    
}
