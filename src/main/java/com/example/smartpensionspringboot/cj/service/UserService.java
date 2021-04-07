package com.example.smartpensionspringboot.cj.service;

import com.example.smartpensionspringboot.cj.mapper.UserMapper;
import com.example.smartpensionspringboot.cj.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Login(String userName,String userPass){
        User user=userMapper.Login(userName,userPass);
        if(user!=null){
            return user;
        }else {
            return null;
        }
    }
}
