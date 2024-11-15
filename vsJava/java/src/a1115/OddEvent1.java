package a1115;

public class OddEvent1 {
    public static void main(String[] args) {
        int a = 0;
        int sum1 = 0;
        int sum2 = 0;
        // for(int i=0; i<=20; i++){
        //     sum1 = sum1 + (i+1);
        //     sum2 = sum2 + (i+2);
        // }
        // System.out.println("홀수 합계 : "+ (sum1 - 21));
        // System.out.println("짝수 합계 : "+ (sum2 - 22));

        while (a<=20) {
            if(a%2==1){
                sum1 += a;
            }
            if(a%2==0){
                sum2 += a;
            }
            a++; 
        }
        System.out.println("홀수 합계 : "+ sum1);
        System.out.println("짝수 합계 : "+ sum2);
    }
}
