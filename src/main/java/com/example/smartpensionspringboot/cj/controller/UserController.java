package com.example.smartpensionspringboot.cj.controller;

import com.example.smartpensionspringboot.cj.pojos.User;
import com.example.smartpensionspringboot.cj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/Login")
    public User Login(@RequestParam("userName") String userName,@RequestParam("userPass") String userPass){
        return userService.Login(userName,userPass);
    }
    @GetMapping("/oldNum")
    public Map oldNum(){
        return userService.oldNum();
    }
    @GetMapping("/waiChu")
    public Map waiChu(){
        return userService.waiChu();
    }
    @GetMapping("/ruZhu")
    public Map ruZhu(){
        return userService.ruZhu();
    }
}
