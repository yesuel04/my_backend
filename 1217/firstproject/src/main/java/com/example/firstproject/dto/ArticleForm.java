package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ArticleForm {
    private Long id;
    private String title; //제목을 받을 필드
    private  String content; //내용을 받을 필드

//    public String getTitle() {
//        return title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public ArticleForm(String title, String content) {
//        this.title = title;
//        this.content = content;
//    }
//
//    public ArticleForm(Long id, String title, String content) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//    }
//
//    @Override
//    public String toString() {
//        return "ArticleForm{" +
//                "title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }


    public Article toEntity() {
        return new Article( id, title, content);
    }
}
