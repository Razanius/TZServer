package com.example.demoo.entity;

import com.example.demoo.enumm.ArticleColorEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

    @NotNull
    private ArticleColorEnum articleColorEnum;

    @ManyToOne
    @JsonIgnore
    private User user;

    public Article(){}

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", articleColorEnum=" + articleColorEnum +
                ", user=" + user +
                '}';
    }
}
