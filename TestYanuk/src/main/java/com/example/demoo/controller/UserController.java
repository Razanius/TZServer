package com.example.demoo.controller;

import com.example.demoo.dto.*;
import com.example.demoo.entity.User;
import com.example.demoo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public UserResponce save(@RequestBody UserRequest userRequest){

        return userService.save(userRequest);
    }

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }


    @PostMapping("/age")
    public List<User> findByAgeGreaterThan(@RequestBody User user){
        return userService.findByAgeGreaterThan(user.getAge());
   }



    @PostMapping("/filterBySize")
    public List<User> findByArt(@RequestParam Integer size) {
        return  userService.findByArt(size);
    }









}
