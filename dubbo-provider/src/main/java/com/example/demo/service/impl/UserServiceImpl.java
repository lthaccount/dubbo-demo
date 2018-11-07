package com.example.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUser() {
        System.out.println("服务[getUser]被调用");
        User user = new User();
        user.setSex("man");
        user.setAge(30);
        user.setName("liyao");
        user.setUserId("asdqwe");
        return user;
    }
}
