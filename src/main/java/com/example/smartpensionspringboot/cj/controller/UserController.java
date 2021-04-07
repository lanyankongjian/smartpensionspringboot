package com.example.smartpensionspringboot.cj.controller;

import com.example.smartpensionspringboot.cj.pojos.User;
import com.example.smartpensionspringboot.cj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/Login")
    public User Login(@RequestParam("userName") String userName,@RequestParam("userPass") String userPass){
        return userService.Login(userName,userPass);
    }
}
