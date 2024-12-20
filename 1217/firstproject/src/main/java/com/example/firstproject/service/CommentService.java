package com.example.firstproject.service;


import com.example.firstproject.dto.CommentDto;
import com.example.firstproject.entity.Article;
import com.example.firstproject.entity.Comment;
import com.example.firstproject.repository.ArticleRepository;
import com.example.firstproject.repository.CommentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private ArticleRepository articleRepository;


    public List<CommentDto> comments(Long articleId) {

        return commentRepository.findByArticleId(articleId)
                .stream()
                .map(comment -> CommentDto.createCommentDto(comment))
                .collect(Collectors.toList());

// 조회: 댓글 목록
       // List<Comment> comments = commentRepository.findByArticleId(articleId);
        // 변환: 엔티티 -> DTO
       // List<CommentDto> dtos = new ArrayList<CommentDto>();
       // for (int i = 0; i < comments.size(); i++) {
         //   Comment c = comments.get(i);
         //   CommentDto dto = CommentDto.createCommentDto(c);
         //   dtos.add(dto);
        //}
        // 반환
        //return dtos;


    }

    @Transactional
    public CommentDto create(Long articleId, CommentDto dto) {
   //게시글 조회 및 예외 발생
       Article article = articleRepository.findById(articleId)
                .orElseThrow(()->new IllegalArgumentException("댓글 생성 실패! 대상 게시글이 없어요"));
        //댓글 엔티티 생성 dto 를 엔티티 변경
        Comment comment  = Comment.createComment(dto, article);
        //댓글 엔티티를 DB로 저장.
        Comment created = commentRepository.save(comment);

        //dto 로 변경하여 리턴.
        return CommentDto.createCommentDto(created);
    }

    @Transactional
    public CommentDto update(Long id, CommentDto dto) {
        //댓글 조회 및 예외 발생
        Comment target = commentRepository.findById(id).
                orElseThrow(()->new IllegalArgumentException("댓글 수정 실패. 대상 댓글 없음."));
        //댓글 수정
        target.patch(dto);
        //db 갱신.
        Comment updated = commentRepository.save(target);
        //댓글 엔티티를 DTO로 변환 및 반환.
        return CommentDto.createCommentDto(updated);
    }

    public CommentDto delete(Long id) {
        Comment target = commentRepository.findById(id).
                orElseThrow(()->new IllegalArgumentException("댓글 삭제 실패. 대상 댓글 없음."));
        //댓글 삭제
        commentRepository.delete(target);
        //댓글 엔티티를 DTO로 변환 및 반환.
        return CommentDto.createCommentDto(target);
    }
}
