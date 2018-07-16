package com.example.demoo.repository;

import com.example.demoo.entity.Article;
import com.example.demoo.enumm.ArticleColorEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{

         Article findOneById(Long id);

         @Query(value = "SELECT t.user.name FROM t.user LEFT JOIN article ON article.user_id = user.id where(article.article_color_enum=?1)", nativeQuery = true)
         List<String> getUsers(ArticleColorEnum  articleColorEnum);




}
