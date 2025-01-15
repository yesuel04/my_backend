package a1112;

import java.util.Scanner;

public class Scan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름 입력 : ");
        String name = scanner.nextLine();
        System.out.print("나이 입력 : ");
        int age = scanner.nextInt();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

    }
    
}