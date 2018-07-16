package com.example.demoo.serviceImpl;

import com.example.demoo.dto.*;
import com.example.demoo.entity.User;
import com.example.demoo.repository.UserRepository;
import com.example.demoo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;




    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findOneById(Long id) {
        return userRepository.findOneById(id);
    }

    @Override
    public UserResponce save(UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getName());
        user.setAge(userRequest.getAge());

        return  new UserResponce(userRepository.save(user));
    }

    @Override
    public List<User> findByAgeGreaterThan(int age) {
        return userRepository.findByAgeGreaterThan(age);
    }



    @Override
    public List<User> findByArt(Integer size) {
        return userRepository.findCv(size);
    }


}
