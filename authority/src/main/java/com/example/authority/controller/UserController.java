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
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author 21167
 */
@RestController
@Api(tags = "用户登录认证")
@RequestMapping(value = "/user")
public class UserController {
     @Autowired
     private UserService userService;
     @Autowired
     private TokenService tokenService;

     @GetMapping(value = "/getUser")
     @ApiOperation(value = "获取员工信息", notes = "获取员工信息")
     public Result<?> getUser(){
         return Result.success(userService.getUser());
     }

     @PostMapping(value = "/login")
     @ApiOperation(value = "登录返回token", notes = "登录返回token")
     public Result<?> login( @RequestBody LoginBody loginBody){
         //用户登录
         User user=userService.login(loginBody);
         return Result.success(tokenService.createToken(user));
     }
}
