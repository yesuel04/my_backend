package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.dto.CommentDto;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import com.example.firstproject.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ArticleController {

    @Autowired //스프링 부트가 미리 생성해 놓은 객체를 가져다가 자동 연결
    private ArticleRepository articleRepository;

    @Autowired
    private CommentService commentService;

    @GetMapping("articles/new") //웹주소
    //http://localhost:8080/articles/new
    public String newArticleForm(){
        return "articles/new";
    }
    //form data 받기
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());

        //1. Dto -> Entity 변환
        Article article = form.toEntity();
        System.out.println(article.toString());
        //2. Repository 에게 Entity 를 DB 안에 저장하게 함
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());
        return "redirect:/articles/"+saved.getId(); //새로고침해서 불러와야함
    }

//    @PostMapping("/articles/create")
//    public String createArticle(ArticleForm form){
//        Article article = new Article();
//        article.setTitle(form.getTitle());
//        article.setContent(form.getContent());
//        Article saved = articleRepository.save(article);
//        return "";
//    }
@GetMapping("/articles")
    public String index(Model model){
        //1. 모든 Article 데이터를 가져온다.
   //Iterable<Article> articleEntityList = articleRepository.findAll();

    List<Article> articleEntityList = articleRepository.findAll();
    //2 가져온 Article 묶음을 뷰로 전달
    model.addAttribute("articleList",articleEntityList);
   //3.뷰페이지설정
    return "articles/index";

}

@GetMapping("articles/{id}") //해당 url 요청처리
public String show(@PathVariable Long id, Model model){
        //url 에서 id 변수를 가져옴
    //1.id로 데이터를 가져옴
   Article articleEntity = articleRepository.findById(id).orElse(null);
   List<CommentDto> commentsDtos = commentService.comments(id);
   //2.가져온데이터를 모뎀에 등록
   model.addAttribute("article",articleEntity);
    model.addAttribute("commentDtos",commentsDtos);
   //보여줄 페이지를 설정!
    return "articles/show";

}
//수정할 번호의 데이터를 불러오기
@GetMapping("/articles/{id}/edit")
    public String edit(@PathVariable Long id, Model model){
    //1.id로 데이터를 가져옴
    Article articleEntity = articleRepository.findById(id).orElse(null);
    //2. 모델에 데이터 등록
    model.addAttribute("article",articleEntity);

   return "articles/edit";
}

@PostMapping("/articles/update")
    public String update(ArticleForm form){
    System.out.println(form.toString());
    //1. Dto를 엔티티로 변환
    Article articleEntity= form.toEntity();
   //2번 엔티티를 Db로 저장
    //2-1 : Db에서 기존 데이터를 가져움
    Article target = articleRepository.findById(articleEntity.getId()).orElse(null);

    //2-2
    if(target != null) {
        articleRepository.save(articleEntity);
    }
    return "redirect:/articles/"+articleEntity.getId();
}
//삭제 완료메세지를 작성해보자


@GetMapping("/articles/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes rttr){
        System.out.println("삭제 요청이 들어왔어요");
        //1.삭제할 대상을 가져옴
       Article target = articleRepository.findById(id).orElse(null);
       System.out.println(target.toString());

       //2: 대상을 삭제
       if(target != null){
           articleRepository.delete(target);
           rttr.addFlashAttribute("msg","삭제가 완료 되었습니다. (아이디:" + id+ ")");
           //삭제후 리다이렉트(새로고침) 이 됬을때 오른쪽에 데이터를 왼쪽에 변수로 저장
       }

      return "redirect:/articles";
}






}
