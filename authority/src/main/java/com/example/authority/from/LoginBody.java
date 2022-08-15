package com.example.authority.from;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 21167
 */
@Data
@ApiModel(value="登录对象",description="登录对象")
public class LoginBody {
    @ApiModelProperty(value = "用户名", notes = "用户名")
    private String username;
    @ApiModelProperty(value = "密码", notes = "密码")
    private String password;
}
