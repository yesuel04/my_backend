package com.highgarden.springboot_board.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
   //요청 url
    private String resourcePath = "/upload/**";

//실제파일 저장 경로
    private String savePath = "file:///C:\\springboot-board\\src\\main\\resources\\upload_files\\";
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(resourcePath)
                .addResourceLocations(savePath);
    }
}
