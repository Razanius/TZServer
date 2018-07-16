package com.example.demoo.serviceImpl;

import com.example.demoo.dto.ArticleRequest;
import com.example.demoo.dto.ArticleResponce;
import com.example.demoo.entity.Article;
import com.example.demoo.enumm.ArticleColorEnum;
import com.example.demoo.repository.ArticleRepository;
import com.example.demoo.repository.UserRepository;
import com.example.demoo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private UserRepository userRepository;



    @Override
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    @Override
    public ArticleResponce save(ArticleRequest articleRequest) {
        Article article = new Article();
        article.setText(articleRequest.getText());
//        article.setUser(userRepository.findById(articleRequest.setIdUser()));
          article.setUser(userRepository.findOneById(articleRequest.getIdUser()));
          article.setArticleColorEnum(articleRequest.getArticleColorEnum());
        return  new ArticleResponce(articleRepository.save(article));
    }




    @Override
    public List<String> getUsers(ArticleColorEnum articleColorEnum) {
        return articleRepository.getUsers(ArticleColorEnum.GREEN);
    }

    //    @Override
//    public List<Article> findByEnum(ArticleColorEnum articleColorEnum) {
//        return articleRepository.findByEnum(articleColorEnum);
//    }
}
