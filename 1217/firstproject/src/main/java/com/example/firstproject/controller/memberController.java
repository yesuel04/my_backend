package com.example.firstproject.controller;

import com.example.firstproject.dto.MemberForm;
import com.example.firstproject.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.firstproject.entity.Member;

@Controller
public class memberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/articles/new1") // 요청 url
    public String newMemberForm(){
        return "articles/new1";
    }

    @PostMapping("/articles/create1") // 요청 url
    public String createMemberForm(MemberForm form){
        System.out.println(form.toString());

        Member member = form.toEntity();
        Member saved = memberRepository.save(member);
        System.out.println(saved.toString());
        return "";
    }
}
