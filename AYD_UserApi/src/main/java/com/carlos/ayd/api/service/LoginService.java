package com.carlos.ayd.api.service;

import com.xx.ayd.common.vo.RJson;
import com.xx.ayd.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA.
 * Author: Carlos
 * Date: 2019/9/21
 * Time: 17:20
 * Description:
 */
@FeignClient("UserService")
public interface LoginService {
    @PostMapping("/user/login/login.do")
    RJson login(@RequestBody User user);
}
