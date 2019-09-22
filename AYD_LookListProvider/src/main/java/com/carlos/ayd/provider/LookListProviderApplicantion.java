package com.carlos.ayd.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by IntelliJ IDEA.
 * Author: Carlos
 * Date: 2019/9/22
 * Time: 16:50
 * Description:
 */
@SpringBootApplication
@MapperScan("com.carlos.ayd.provider.dao")
@EnableDiscoveryClient
public class LookListProviderApplicantion {
    public static void main(String[] args) {
        SpringApplication.run(LookListProviderApplicantion.class, args);
    }
}
