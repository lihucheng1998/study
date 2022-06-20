package com.example.authority.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author 21167
 */
@Data
public class User {
    @TableId
    private Integer userId;
    private String name;
    private String password;
}
