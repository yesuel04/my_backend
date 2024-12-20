package com.example.firstproject.service;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> index() {
        return articleRepository.findAll();
    }

    public Article show(Long id) {
        return articleRepository.findById(id).orElse(null);
    }


    public Article create(ArticleForm dto) {
        Article article = dto.toEntity();
        if(article.getId() != null){
            return null;  // 처음 생성될때는 id가 null 이어야함
        }
        return articleRepository.save(article);
    }


    public Article update(Long id, ArticleForm dto) {
        //1. dto -> entity
        Article article = dto.toEntity();
        System.out.println(id + " , "+ article.toString() );
        //2. 타켓조회(id조회)
        Article target =  articleRepository.findById(id).orElse(null);
        //3. 잘못된 요청 처리
        if(target == null || id != article.getId()){
            //400, 잘못된 요청 응답
            return null;
            //System.out.println("잘못된요청" + id + " , "+ article.toString() );
        }
        //4. 업데이트 및 정상 응답
        target.patch(article);
        Article updated = articleRepository.save(target);
        return updated;
    }

    public Article delete(Long id) {
        //대상찾기
        Article target = articleRepository.findById(id).orElse(null);
        //잘못된 요청처리
        if(target == null){
            return null;
        }
        //대상삭제
        articleRepository.delete(target);
        return target;
    }
}
