package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  //controller 선언
public class FirstController {
    @GetMapping("/hi") //2. 요청  url - request
    public String nice(Model model){
        model.addAttribute("username","준석님!!");
        //보여줄 페이지 리턴
        return "greetings"; //응답 response
    }

}
