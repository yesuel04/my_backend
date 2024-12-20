package com.example.firstproject.controller;

import com.example.firstproject.dto.MemberForm;
import com.example.firstproject.entity.Member;
import com.example.firstproject.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("articles/new1")
    public String newMemberFrom(){
        return "articles/new1";
    }

    @PostMapping("/articles/create1")
    public String createMember(MemberForm form1){
        System.out.println(form1.toString());

        //1. Dto(MemberForm) -> Entity(Member) 변환
        Member member = form1.toEntity();
        System.out.println(member.toString());

        //2. Repository 에게 Entity 를 Db에 저장하게 함
        Member saved1= memberRepository.save(member);
        System.out.println(saved1.toString());
        return "";
    }


}
