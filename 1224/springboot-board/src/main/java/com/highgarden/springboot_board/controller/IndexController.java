package com.highgarden.springboot_board.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class indexController {
    @GetMapping("/")
    public String index(){
        //System.out.println("index 메서드 call"); - 실전에서 안씀
        //대신 log.info -> lombok 설치후 상단에 @Slf4j
        log.info("index 메서드 call");
        return "index";
    }
}
