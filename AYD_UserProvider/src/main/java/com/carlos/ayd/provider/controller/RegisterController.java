package com.carlos.ayd.provider.controller;

import com.carlos.ayd.provider.cache.JedisUtil;
import com.carlos.ayd.provider.config.EncryptionUtil;
import com.carlos.ayd.provider.config.SystemConfig;
import com.carlos.ayd.provider.service.UserService;
import com.carlos.ayd.provider.utils.MailUtils;
import com.xx.ayd.common.util.RJsonUtil;
import com.xx.ayd.common.vo.RJson;
import com.xx.ayd.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/20
 * Time: 19:33
 */
@RestController
public class RegisterController {
    @Autowired
    private UserService userService;

    private JedisUtil jedisUtil = JedisUtil.getInstance();

    // 发送邮件
    @PostMapping("/user/register/sendEmail.do")
    public RJson sendEmail(@RequestParam String email) {
        //这里是利用MailUtils工具类，获取6位数的随机验证码
        String validateCode = MailUtils.getValidateCode(6);
        Boolean e = jedisUtil.exists(email);
        if(e == false) {

            try {
                //调用sendMail方法，参数分别是：邮箱、邮件标题、邮件内容
                MailUtils.sendMail(email, "<div>您好:</div><div style='text-indent:25px;'>您本次注册的验证码是<span style='color:red'>" + validateCode + "</span>,请于三十分钟内输入，否则失效。</div>","悦微易读注册邮件");
                String s = jedisUtil.setex(email, 1800, validateCode);
                return RJsonUtil.setOK("邮件发送成功");
            } catch (Exception ex) {
                return RJsonUtil.setERROR("邮件发送失败");
            }
        } else {
            return RJsonUtil.setOK("邮件已发送，请勿重复发送");
        }
    }

    // 邮箱注册
    @PostMapping("/user/register/register.do")
    public RJson register(@RequestParam String email, @RequestParam String code, @RequestParam String password) {
        String s = jedisUtil.get(email);
        User user = new User();
        user.setEmail(email);
        String pwd = EncryptionUtil.AESEnc(SystemConfig.PASSKEY, password);
        user.setPassword(pwd);
        if (s.equals(code)) {
            boolean b = userService.save(user);
            return RJsonUtil.setR(b, "注册成功");
        } else {
            return RJsonUtil.setERROR("注册失败，验证码不一致");
        }
    }

}
