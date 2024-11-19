package a1119;

import java.util.Scanner;

public class Marray03 {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0]=new int[2];
        a[1]=new int[4];
        a[2]=new int[3];

        Scanner scan = new Scanner(System.in);
        for(int i=0; i<a.length; i++){

            System.out.print("입력해주세요 : ");

            for(int j=0; j<a[i].length; i++){
                a[i][j] = scan.nextInt();
            }
        }

        //출력 
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; i++){
                System.out.print(a[i][j]+" ");
            }
        }
    }
}
