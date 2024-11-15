package a1115;

import java.util.Scanner;

public class Star1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("입력 : ");
        int n = scan.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
