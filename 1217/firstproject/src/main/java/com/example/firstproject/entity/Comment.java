package com.example.firstproject.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cache;

@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    //데이터베이스에서 생성될 외래키 이름 article_id
    //article_id 는 comment 테이블에서 Article 테이블 참조하는 컬럼.
    //다대일 관계(한 개의 게시글에 여러 개의 댓글)

    @Column
    private String nickname;

    @Column
    private String body;

}
