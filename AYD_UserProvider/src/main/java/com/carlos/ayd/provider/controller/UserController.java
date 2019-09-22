package com.carlos.ayd.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.carlos.ayd.provider.cache.JedisUtil;
import com.carlos.ayd.provider.service.UserService;
import com.xx.ayd.common.util.RJsonUtil;
import com.xx.ayd.common.vo.RJson;
import com.xx.ayd.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by IntelliJ IDEA.
 * Author: Carlos
 * Date: 2019/9/21
 * Time: 19:27
 * Description: 用户相关
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    private JedisUtil jedisUtil = JedisUtil.getInstance();

    @GetMapping("/user/queryUser.do")
    public RJson queryUser(@RequestParam String token) {
        String email = jedisUtil.get(token);
        User user = userService.getBaseMapper().selectOne(new QueryWrapper<User>().eq("email", email));
        return RJsonUtil.setOK("查询成功", user);
    }
}
