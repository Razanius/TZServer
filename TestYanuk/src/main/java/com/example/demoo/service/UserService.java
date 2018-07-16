package com.example.demoo.service;

import com.example.demoo.dto.*;
import com.example.demoo.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    UserResponce save(UserRequest userRequest);
    User findOneById(Long id);
    List<User> findByAgeGreaterThan(int age);
    List<User> findByArt(Integer size);
}
