package a1127.Animal;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal[] animals = new Animal[3]; // 최대 3마리 동물 관리
        int index = 0;

        while (true) {
            if (index == animals.length) break; // 배열이 꽉 차면 종료

            System.out.println("1. 개  2. 새  3. 물고기  (그만: 종료)");
            System.out.print(">> ");
            String input = sc.next();

            if (input.equals("그만")) break;

            System.out.print("이름 입력: ");
            String name = sc.next();
            System.out.print("나이 입력: ");
            int age = sc.nextInt();

            switch (input) {
                case "1":
                    animals[index++] = new Dog(name, age); // 배열에 Dog 객체 저장
                    break;
                case "2":
                    animals[index++] = new Bird(name, age); // 배열에 Bird 객체 저장
                    break;
                case "3":
                    animals[index++] = new Fish(name, age); // 배열에 Fish 객체 저장
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    break;
            }
        }

        System.out.println("\n===== 동물 정보 =====");
        for (Animal animal : animals) {
            if (animal == null) continue;

            animal.info();
            animal.sound();
            animal.move();
            System.out.println();
        }

        sc.close();
    }
}
