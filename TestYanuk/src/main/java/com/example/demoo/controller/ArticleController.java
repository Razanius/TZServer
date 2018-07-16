package com.example.demoo.controller;

import com.example.demoo.dto.ArticleRequest;
import com.example.demoo.dto.ArticleResponce;
import com.example.demoo.entity.Article;
import com.example.demoo.enumm.ArticleColorEnum;
import com.example.demoo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/article")
public class ArticleController {

    
    @Autowired
    private ArticleService articleService;

    @PutMapping
    public ArticleResponce save(@RequestBody ArticleRequest articleRequest){
        return articleService.save(articleRequest);
    }

    @GetMapping
    public List<Article> getAll(){
        return articleService.findAll();
    }




    @GetMapping("/query")
    public List<String> createQuery(ArticleColorEnum articleColorEnum){
        List<String> users = articleService.getUsers(ArticleColorEnum.GREEN);
        return users;
    }
}
