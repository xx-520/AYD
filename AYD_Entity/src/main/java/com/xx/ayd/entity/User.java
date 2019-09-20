package com.xx.ayd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/20
 * Time: 11:03
 */
@Data
@TableName(value = "user")
public class User {
    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String headImg;
}
