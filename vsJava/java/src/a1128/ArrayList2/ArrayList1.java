package a1128.ArrayList2;

import java.util.ArrayList;
import java.util.Scanner;

import a1112.Scan1;

// 문제 1: 이름 목록 관리 (기본)
// 사용자로부터 이름을 입력받아 ArrayList에 저장하고, 다음 작업을 수행하세요:

// 이름을 추가합니다.
// 특정 이름이 목록에 있는지 확인합니다.
// 목록의 전체 내용을 출력합니다.
// 입력 예시:
// 이름을 입력하세요 (끝내려면 'exit' 입력): 
// > Alice
// > Bob
// > Charlie
// > exit

// 출력 예시:

// 저장된 이름: [Alice, Bob, Charlie]
// 'Bob'이 목록에 존재합니다.

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String[] ArrayList = new String[];
        ArrayList<String> list = new ArrayList<>();


        boolean run = true;

        System.out.println("이름을 입력하세요 (끝내려면 'exit' 입력) : ");
        while (run) {
            System.out.print(" > ");
            String name = scan.nextLine();
            if (name.equalsIgnoreCase("exit")) break;
            list.add(name);
        }
        scan.close();

        System.out.println("저장된 이름 : "+list);
        

    }
}
