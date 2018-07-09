package com.test.server.entity;
import org.springframework.data.annotation.Id;
import javax.persistence.Entity;

@Entity
public class User {
    private Long id;
    private String name;
    private int age;


    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
