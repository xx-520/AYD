package com.carlos.ayd.api.service;

import com.xx.ayd.common.vo.RJson;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/21
 * Time: 9:57
 */
@FeignClient("UserService")
public interface RegisterService {
    @PostMapping("/user/register/sendEmail.do")
    RJson sendEmail(@RequestParam String email);

    @PostMapping("/user/register/register.do")
    RJson register(@RequestParam String email, @RequestParam String code, @RequestParam String password);
}
