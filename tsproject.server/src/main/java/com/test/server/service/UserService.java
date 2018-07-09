package com.test.server.service;

import com.test.server.entity.User;

import java.util.List;

public interface UserService {
    public void saveUser(User user);
    public List<User> findAllUser();
}
