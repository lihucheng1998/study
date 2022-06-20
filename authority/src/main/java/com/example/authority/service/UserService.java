package com.example.authority.service;

import com.example.authority.mapper.UserMapper;
import com.example.authority.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 21167
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(){
        return userMapper.selectById(1001);
    }
}
