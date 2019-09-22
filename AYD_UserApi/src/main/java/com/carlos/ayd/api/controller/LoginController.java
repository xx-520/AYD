package com.carlos.ayd.api.controller;

import com.carlos.ayd.api.service.LoginService;
import com.xx.ayd.common.vo.RJson;
import com.xx.ayd.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Author: Carlos
 * Date: 2019/9/21
 * Time: 17:21
 * Description:
 */
@Api(value = "登录操作", tags = "登录操作")
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @ApiOperation(value = "登录", notes = "登录")
    @PostMapping("/api/user/login.do")
    public RJson login(@RequestBody User user) {
        return loginService.login(user);
    }
}
