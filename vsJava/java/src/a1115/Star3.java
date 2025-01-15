package a1115;

import java.util.Scanner;

public class Star3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("입력 : ");
        int n = scan.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                // System.out.print(j);
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
