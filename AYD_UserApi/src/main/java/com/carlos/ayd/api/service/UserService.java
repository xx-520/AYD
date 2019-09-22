package com.carlos.ayd.api.service;

import com.xx.ayd.common.vo.RJson;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by IntelliJ IDEA.
 * Author: Carlos
 * Date: 2019/9/21
 * Time: 19:55
 * Description:
 */
@FeignClient("UserService")
public interface UserService {
    @GetMapping("/user/queryUser.do")
    public RJson queryUser(@RequestParam String token);
}
