package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import com.example.firstproject.entity.Member;

public class MemberForm {
    //private Long id;
    private String name;
    private  String nickname;
    private  String password;

    public MemberForm(String name, String nickname, String password) {
        this.name = name;
        this.nickname = nickname;
        this.password = password;
    }

    @Override
    public String toString() {
        return "MemberForm{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Member toEntity() {
       return new Member(null, name, nickname, password);
    }
}
