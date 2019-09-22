package com.carlos.ayd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/21
 * Time: 11:17
 */
@SpringBootApplication
@MapperScan("com.carlos.ayd.dao")
@EnableDiscoveryClient
public class WeeApplicantion {
    public static void main(String[] args) {
        SpringApplication.run(WeeApplicantion.class, args);
    }
}
