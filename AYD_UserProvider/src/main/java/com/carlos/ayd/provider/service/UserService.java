package com.carlos.ayd.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xx.ayd.common.vo.RJson;
import com.xx.ayd.entity.User;


/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/20
 * Time: 18:45
 */
public interface UserService extends IService<User> {
    public RJson login(User user);
}
