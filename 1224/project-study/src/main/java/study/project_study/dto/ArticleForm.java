package study.project_study.dto;

import lombok.*;
import study.project_study.entity.Article;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ArticleForm {
    private Long id;
    private  String title;
    private String content;

//    public ArticleForm(String title, String content) {
//        this.title = title;
//        this.content = content;
//    }
//
//    @Override
//    public String toString() {
//        return "ArticleForm{" +
//                "title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }

    public Article toEntity() {
        return new Article(id, title, content);
    }
}
