package com.carlos.ayd.provider.controller;

import com.carlos.ayd.provider.service.UserService;
import com.xx.ayd.common.vo.RJson;
import com.xx.ayd.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Author: Carlos
 * Date: 2019/9/21
 * Time: 17:02
 * Description:
 */
@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping("/user/login/login.do")
    public RJson login(@RequestBody User user) {
        return userService.login(user);
    }
}
