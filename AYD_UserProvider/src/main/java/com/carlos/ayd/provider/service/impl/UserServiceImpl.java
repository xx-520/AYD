package com.carlos.ayd.provider.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.carlos.ayd.provider.cache.JedisUtil;
import com.carlos.ayd.provider.config.EncryptionUtil;
import com.carlos.ayd.provider.config.MD5Utils;
import com.carlos.ayd.provider.config.SystemConfig;
import com.carlos.ayd.provider.dao.UserDao;
import com.carlos.ayd.provider.service.UserService;
import com.xx.ayd.common.util.RJsonUtil;
import com.xx.ayd.common.vo.RJson;
import com.xx.ayd.entity.User;
import org.springframework.stereotype.Service;


/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/20
 * Time: 19:00
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
    private JedisUtil jedisUtil = JedisUtil.getInstance();

    @Override
    public RJson login(User user) {
        // 1、查询账号对应的用户信息
        User userInfo = getBaseMapper().selectOne(new QueryWrapper<User>().eq("email", user.getEmail()));
        if (userInfo != null) {
            //验证密码是否正确 密文对比
            if (userInfo.getPassword().equals(EncryptionUtil.AESEnc(SystemConfig.PASSKEY, user.getPassword()))) {
                String token = MD5Utils.md5(user.getEmail() + "ayd");
                // 将登录的用户名保存到redis，以方便调用
                jedisUtil.setex(token, 1800, user.getEmail());
                return RJsonUtil.setOK("登录成功");
            } else {
                return RJsonUtil.setOK("账号或密码错误");
            }
        } else {
            return RJsonUtil.setERROR("账号不存在");
        }
    }
}
