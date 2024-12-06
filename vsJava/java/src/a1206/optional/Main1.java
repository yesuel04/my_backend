package a1206.optional;

import java.util.Optional;

public class Main1 {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        // 존재하는 ID로 검색
        Optional<User> UserOptional1 = userRepository.findById(2L);
        UserOptional1.ifPresentOrElse(
            user -> System.out.println("찾는 사용자 : "+user),
            ()-> System.out.println("찾는 사용자가 없습니다.")
        );
        //출력 : >> 찾는 사용자 : User{id=2, name='Bob'} <<
        Optional<User> UserOptional2 = userRepository.findById(90L);
        UserOptional2.ifPresentOrElse(
            user -> System.out.println("찾는 사용자 : "+user),
            ()-> System.out.println("찾는 사용자가 없습니다.")
        );
        //출력 : >> 찾는 사용자가 없습니다. <<

         // 기본값 제공
         User defaultUser = UserOptional2.orElse(new User(0L, "Default User"));
         System.out.println("기본 사용자: " + defaultUser);
         // 출력: 기본 사용자: User{id=0, name='Default User'}
    }
}

//findbyId 메서드
//아이디로 사용자 리스트를 검색하고, 결과를 Optional<User>로 반환.
//Optional.empty()는 사용자가 없을 때 반환.
//Optional 처리 방식
//ifPreertOrElse : 값이 있으면 처리, 없으면 대체 동작 수행.
//orElse : 값이 없으면 기본값을 반환.

