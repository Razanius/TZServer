package com.example.demoo.dto;

import com.example.demoo.entity.Article;
import com.example.demoo.enumm.ArticleColorEnum;

public class ArticleResponce {
    private Long id;
    private String text;
    private ArticleColorEnum articleColorEnum;

    private UserResponce userResponce;

    public ArticleResponce(Article article) {
        this.id = article.getId();
        this.text = article.getText();
        this.articleColorEnum = article.getArticleColorEnum();
        this.userResponce = new UserResponce(article.getUser());

    }
    public ArticleColorEnum getArticleColorEnum() {
        return articleColorEnum;
    }

    public void setArticleColorEnum(ArticleColorEnum articleColorEnum) {
        this.articleColorEnum = articleColorEnum;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public UserResponce getUserResponce() {
        return userResponce;
    }

    public void setUserResponce(UserResponce userResponce) {
        this.userResponce = userResponce;
    }
}
