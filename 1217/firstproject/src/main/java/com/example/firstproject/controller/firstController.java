package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class firstController {
    @GetMapping("/hi") // 요청 url
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "ㅍㅅㅍ" );
        // 보여줄 페이지 리턴
        return "greetings"; // 응답
    }
}
