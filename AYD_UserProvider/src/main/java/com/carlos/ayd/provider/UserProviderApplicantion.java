package com.carlos.ayd.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/20
 * Time: 18:17
 */
@SpringBootApplication
@MapperScan("com.carlos.ayd.provider.dao")
@EnableDiscoveryClient
public class UserProviderApplicantion {
    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplicantion.class, args);
    }
}
