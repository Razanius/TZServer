package com.test.server.entity;

import javax.persistence.Entity;

public class Article {
    private Long id;
    private String text;

    public enum Color {
        BLACK("Black"), YELLOW("Yellow"), GREEN("Green"), BLUE("Blue"), WHITE("White"), RED("Red"), GRAY("Gray"), ORANGE("Orange"), BROWN("Brown");

        Color(String color) {
            this.color = color;
        }

        private String color;

        public String getColor() {
            return color;
        }
    }

    public Article() {
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
}
