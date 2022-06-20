package com.example.authority.controller;

import com.example.authority.pojo.User;
import com.example.authority.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 21167
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
     @Autowired
     private UserService userService;

     @GetMapping(value = "/getUser")
     public User getUser(){
         return userService.getUser();
     }
}
