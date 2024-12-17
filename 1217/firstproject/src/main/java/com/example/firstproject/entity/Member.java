package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity // DB가 해당하는 객체를 인식 가능하게 함
public class Member {
    @Id // Entity의 대표값
    @GeneratedValue // 1,2,3 자동으로 번호를 추가하는 어노케이션
    private Long id;

    @Column
    private String name;

    @Column
    private String nickname;

    @Column
    private String password;

    public Member(Long id, String name, String nickname, String password) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
