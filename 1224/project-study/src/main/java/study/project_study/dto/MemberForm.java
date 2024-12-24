package study.project_study.dto;

import lombok.*;
import study.project_study.entity.Member;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

//멤버를 crud하는 controller, repository, mustache를 만들기.
public class MemberForm {
    private Long id;
    private String name;
    private String nickname;
    private String password;

    public Member toEntity() {
        return new Member(id, name, nickname, password);
    }


}
