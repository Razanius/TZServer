package com.test.server.controller;

import com.test.server.entity.User;
import com.test.server.repository.UserRepository;
import com.test.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.annotation.WebServlet;
import java.util.List;

@Controller

@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@RequestParam Long id, @RequestParam String name, @RequestParam int age) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        userService.saveUser(user);
        return "We saved user with name " + name;
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public List<User> findAll(){
        return userService.findAllUser();
    }
}
