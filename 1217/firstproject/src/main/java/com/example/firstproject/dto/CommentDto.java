package com.example.firstproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommentDto {

    private Long id;

    @JsonProperty("article_id")
    private Long articleId;
    //json데이터를 받아올 때 변수명이 다르면
    //@JsonProperty("컬럼명");

    private String nickname;
    private String body;
}
