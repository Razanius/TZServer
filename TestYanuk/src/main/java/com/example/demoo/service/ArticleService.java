package com.example.demoo.service;

import com.example.demoo.dto.ArticleRequest;
import com.example.demoo.dto.ArticleResponce;
import com.example.demoo.entity.Article;
import com.example.demoo.enumm.ArticleColorEnum;

import java.util.List;

public interface ArticleService {
    List<Article> findAll();
    ArticleResponce  save(ArticleRequest articleRequest);
    List<String> getUsers(ArticleColorEnum  articleColorEnum);
}
