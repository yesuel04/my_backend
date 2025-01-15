package a1120;

import javax.management.relation.Role;

public class RoleEX {
    public static void main(String[] args) {
        Role1 role = Role1.ADMIN;

        System.out.println("현재 역할 : " + role);
        System.out.println("일반 사용자 역할 : " + Role1.USER);

        if(role == Role1.ADMIN){
            System.out.println("관리자 권한이 있습니다.");
        }else if(role == Role1.USER){
            System.out.println("일반 사용자 입니다.");
        }

        // enum 타입을 쓰는 이유
        // 1. 가독성 ADMIN, USER 같이 의미를 쉽게 알 수 있음
        // 2. 안정성
        // 3. 유지보수성
        
    }
}
