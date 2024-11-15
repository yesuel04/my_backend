package a1115;

public class For1 {
    public static void main(String[] args) {
        //1. i를 1부터 10까지 출력하기
        for(int i = 1; i<=10; i++){
            System.out.print(i+" ");
        }

        //2. i를 50부터 100까지 출력하기
        for(int i=50; i<=100; i++){
            System.out.print(i+" ");
        }

        //3. i를 1부터 20까지 정수 중에서 짝수만 출력하기
        for(int i=1; i<=20; i++){
            i=i+1;
            System.out.print(i+" ");
        }

        //4. i를 10부터 20까지 정수 중에서 홀수만 출력하기
        for(int i=10; i<20; i++){
            i=i+1;
            System.out.print(i+" ");
        }
    }
}
