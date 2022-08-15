package com.example.authority.controller;

import com.example.authority.from.LoginBody;
import com.example.authority.pojo.User;
import com.example.authority.service.TokenService;
import com.example.authority.service.UserService;
import com.example.common.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 21167
 */
@RestController
@RequestMapping(value = "/user")
@Api(value = "用户数据查询",tags = "用户查询")
public class UserController {
     @Autowired
     private UserService userService;
     @Autowired
     private TokenService tokenService;

     @GetMapping(value = "/getUser")
     @ApiOperation(httpMethod = "GET",value = "获取1001用户信息")
     public Result<?> getUser(){
         return Result.success(userService.getUser());
     }

     @PostMapping(value = "/login")
     @ApiOperation(httpMethod = "POST",value = "用户登录")
     public Result<?> login(@RequestBody LoginBody loginBody){
         //用户登录
         User user=userService.login(loginBody);
         return Result.success(tokenService.createToken(user));
     }
}
