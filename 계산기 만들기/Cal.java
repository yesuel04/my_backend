import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("[ 간단한 사칙연산 계산기 ]");
            System.out.println("1. 더하기");
            System.out.println("2. 빼기");
            System.out.println("3. 곱하기");
            System.out.println("4. 나누기");
            System.out.println("0. 계산기 실행 종료");
    
            System.out.print("번호를 선택하세요 >> ");
            int choice = scan.nextInt();
    
            System.out.println("----------------------------------");
    
            if (choice == 0) {
                System.out.println("[ 계산기 실행 종료 ]");
                System.exit(0); 
            }
    
            System.out.print("첫번째 숫자를 입력하세요 >> ");
            double num1 = scan.nextDouble();
            System.out.print("두번째 숫자를 입력하세요 >> ");
            double num2 = scan.nextDouble();
    
            System.out.println("----------------------------------");
    
            double result;
    
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    System.out.println("결과 : " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    System.out.println("결과 : " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    System.out.println("결과 : " + result);
                    break;
                case 4:
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                    System.out.println("결과 : " + result);
                    break;
                default:
                    System.out.println("번호를 다시 입력해주세요");
                    break;
            }
            System.out.println("----------------------------------");
        }
    }
}
