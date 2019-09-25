package com.xx.ayd.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.xx.ayd.server.dao")   //扫描Mybatis的Dao层
@EnableDiscoveryClient   //注册服务
public class AydServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AydServerApplication.class, args);
    }

}
