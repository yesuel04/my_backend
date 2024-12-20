package com.example.firstproject.entity;

import com.example.firstproject.dto.CommentDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    //데이터베이스에서 생성될 외래키 이름  article_id
    // article_id 는 comment 테이블에서 Article 테이블 참조하는 컬럼
    //다대일 관계

    @Column
    private String nickname;

    @Column
    private String body;

    public static Comment createComment(CommentDto dto, Article article) {
        //예외발생
        if(dto.getId() != null){
            throw new IllegalArgumentException("댓글 생성 싶패! 댓글은 id가 없어야함");
        }
        if (dto.getArticleId() != article.getId())
            throw new IllegalArgumentException("댓글 생성 실패! 게시글의 id가 잘못되었습니다.");
        //엔티티 생성 및 반환
        return new Comment(
                dto.getId(), article ,dto.getNickname() ,dto.getBody()
        );

    }

    public void patch(CommentDto dto) {
        if(this.id != dto.getId()){
            throw new IllegalArgumentException("댓글 수정 실패. 잘못된 id가 입력됨.");
        }
        //갱신
        if(dto.getNickname() != null){
            this.nickname = dto.getNickname();
        }
        if (dto.getBody() != null){
            this.body = dto.getBody();
        }
    }
}
