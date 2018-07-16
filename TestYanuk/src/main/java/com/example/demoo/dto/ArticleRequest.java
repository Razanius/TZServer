package com.example.demoo.dto;

import com.example.demoo.enumm.ArticleColorEnum;

public class ArticleRequest {

    private String text;
    private ArticleColorEnum articleColorEnum;
    private Long idUser;
    public ArticleRequest(){}

    public ArticleColorEnum getArticleColorEnum() {
        return articleColorEnum;
    }

    public void setArticleColorEnum(ArticleColorEnum articleColorEnum) {
        this.articleColorEnum = articleColorEnum;
    }



    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "ArticleRequest{" +
                "text='" + text + '\'' +
                ", articleColorEnum=" + articleColorEnum +
                ", idUser=" + idUser +
                '}';
    }
}
