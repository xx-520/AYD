package com.carlos.ayd.api.controller;

import com.carlos.ayd.api.service.UserService;
import com.xx.ayd.common.vo.RJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * Author: Carlos
 * Date: 2019/9/21
 * Time: 19:56
 * Description:
 */
@Api(value = "用户操作", tags = "用户操作")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户信息", notes = "查询用户信息")
    @GetMapping("/api/user/queryUser.do")
    public RJson queryUser(ServletRequest servletRequest) {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String token = req.getHeader("token");
        return userService.queryUser(token);
    }
}
