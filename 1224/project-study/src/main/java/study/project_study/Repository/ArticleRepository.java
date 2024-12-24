package study.project_study.Repository;

import org.springframework.data.repository.CrudRepository;
import study.project_study.entity.Article;

import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article, Long> {

    @Override
//    Optional<Article> findById(Long id);
    ArrayList<Article> findAll();
}
