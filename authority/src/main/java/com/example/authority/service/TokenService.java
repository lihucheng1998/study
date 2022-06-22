package com.example.authority.service;

import com.example.authority.pojo.User;
import com.example.common.util.JwtUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author 21167
 */
@Service
public class TokenService {
    public Map<String,Object> createToken(User user){
         String token = UUID.randomUUID().toString();
         Map<String,Object> map=new HashMap<>();
         map.put("user_key",token);
         map.put("user_name",user.getName());
         map.put("user_id",user.getUserId());
         Map<String,Object> rest=new HashMap<>();
         rest.put("access_token", JwtUtils.createToken(map));
         return rest;
    }
}
