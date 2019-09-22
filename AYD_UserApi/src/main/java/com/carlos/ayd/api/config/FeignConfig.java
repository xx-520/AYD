package com.carlos.ayd.api.config;

import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/10
 * Time: 17:43
 */
@Configuration
public class FeignConfig {
    private int connecttimeout=20000; //20秒
    private int readtimeout=20000; // 20秒

    @Bean
    public Request.Options createOp() {
        return new Request.Options(connecttimeout, readtimeout);
    }
}
