package com.test.server.service.serviceIml;

import com.test.server.entity.User;
import com.test.server.repository.UserRepository;
import com.test.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
    @Override
    public List<User> findAllUser(){
        return userRepository.findAll();
    }
}
