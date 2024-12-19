package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article, Long> {
//CrudRepository 는  jpa 제공하는 인터페이스, 이를 상속해서 (생성,조회,수정,삭제) 할 수 있다.
//CrudRepository 는 2개의 제네릭요소를 받습니다.
//CrudRepository<관리할 대상의 엔티티 클래스, 엔티티의 대표값 타입>

    // @Override 통해서 리턴타입을 ArrayList 로 변경
    @Override
    ArrayList<Article> findAll();
}
