package com.carlos.ayd.api.controller;

import com.carlos.ayd.api.service.RegisterService;
import com.xx.ayd.common.vo.RJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/21
 * Time: 10:01
 */
@Api(value = "注册操作", tags = "注册操作")
@RestController
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    // 发送邮件
    @ApiOperation(value = "发送邮件", notes = "发送邮件")
    @PostMapping("/api/user/sendEmail.do")
    public RJson sendEmail(@RequestParam String email) {
        return registerService.sendEmail(email);
    }

    // 注册
    @ApiOperation(value = "邮箱注册", notes = "邮箱注册")
    @PostMapping("/api/user/register.do")
    public RJson register(@RequestParam String email, @RequestParam String code, @RequestParam String password) {
        return registerService.register(email, code, password);
    }
}
