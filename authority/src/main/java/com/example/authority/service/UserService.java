package com.example.authority.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.authority.from.LoginBody;
import com.example.authority.mapper.UserMapper;
import com.example.authority.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

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

    public User login(LoginBody loginBody){
        Map<String,Object> map=new HashMap<>();
        map.put("name",loginBody.getUsername());
        map.put("password",loginBody.getPassword());
        return userMapper.selectByMap(map).get(0);
    }
}
