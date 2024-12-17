package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

public class ArticleForm {
    private Long id;
    private String title;
    private String content;


    public ArticleForm(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "AtricleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {
        return new Article(null, title, content);
    }
}
