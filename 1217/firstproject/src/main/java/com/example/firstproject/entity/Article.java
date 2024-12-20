package com.example.firstproject.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity //DB가 해당 객체를 인식가능하게 함
@Getter
@Setter
@ToString
@AllArgsConstructor //모든생성자
@NoArgsConstructor //기본생성자
public class Article {
    @Id //Entity에 대표값 - 식별
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //sql 에서 번호를 자동으로 만들어줌
    private Long id;

    @Column
    private  String title;

    @Column
    private String content;

    public void patch(Article article) {
        if(article.title != null){
            this.title = article.title;
        }
        if(article.content != null){
            this.content = article.content;
        }

    }

//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public Article(Long id, String title, String content) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//    }
//
//    public Article() {
//
//    }
//
//    @Override
//    public String toString() {
//        return "Article{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }
}
