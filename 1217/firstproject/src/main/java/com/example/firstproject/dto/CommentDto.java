package com.example.firstproject.dto;

import com.example.firstproject.entity.Comment;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {
    private Long id;
    @JsonProperty("article_id")
    private Long articleId;
    //json데이터를 받아올때 변수명이 다르면
    //@JsonProperty("컬럼명");

    private String nickname;
    private String body;


    public static CommentDto createCommentDto(Comment comment) {
        return new CommentDto(comment.getId(),
                             comment.getArticle().getId(),
                            comment.getNickname(),
                            comment.getBody()

             );
    }
}
