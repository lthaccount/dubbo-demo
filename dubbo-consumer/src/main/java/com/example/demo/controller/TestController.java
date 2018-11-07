package com.example.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dubbo")
public class TestController {
    @Reference
    private UserService userService;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getUser(){
        User user = userService.getUser();
        return user;
    }
}
