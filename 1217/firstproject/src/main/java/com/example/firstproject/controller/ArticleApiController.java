package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import com.example.firstproject.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController // json을 지원하는 컨트롤러
public class ArticleApiController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/api/articles")
    public List<Article> index(){
        return articleService.index();
    }

    @GetMapping("/api/articles/{id}")
    public Article show(@PathVariable Long id){
        return articleService.show(id);
    }

    //Post
    //http post 요청을 api/articles/
    @PostMapping("/api/articles")
    public ResponseEntity<Article> create(@RequestBody ArticleForm dto){
        //json 데이터 ArticleForm 객체로 매핑(변환)
        Article created = articleService.create(dto);
        return (created != null) ? ResponseEntity.status(HttpStatus.OK).body(created) :
                                    ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @PatchMapping("/api/article/{id}")
    public ResponseEntity<Article> update(@PathVariable Long id, @RequestBody ArticleForm dto){

        Article updated = articleService.update(id, dto);
        return (updated != null) ? ResponseEntity.status(HttpStatus.OK).body(updated) :
                                    ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

//        //1. dto > entity
//        Article article = dto.toEntity();
//        System.out.println(id+" , "+article.toString());
//
//        //2. 타겟조회(id조회)
//        Article target = articleRepository.findById(id).orElse(null);
//
//        //3. 잘못된 요청 처리
//        if (target == null || id != article.getId()){
//            //400, 잘못된 요청 응답
//            System.out.println("잘못된 요청"+id+" , "+article.toString());
//        }
//
//        //4. 업데이트 및 정상 응답
//        target.patch(article);
//            Article updated = articleRepository.save(target);
//            return ResponseEntity.status(HttpStatus.OK).body(null);
    }       //update 성공 응답(200)
//
    @DeleteMapping("/api/articles/{id}")
    public ResponseEntity<Article> delete(@PathVariable Long id){
        Article deleted = articleService.delete(id);
        return (deleted != null) ? ResponseEntity.status(HttpStatus.NO_CONTENT).build() :
                                    ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

    }
    // return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); // 404 응답
    // HttpStatus.NO_CONTENT -http 상태코드 204
    //응답 본문은 비워서 클라이언트에게 전송됩니다.
    // Delete 요청 또는 서버에 추가적인 응답 본문이 필요하지 않은 경우
}
