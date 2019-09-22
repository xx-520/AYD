package com.carlos.ayd.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by IntelliJ IDEA.
 * Author: Carlos
 * Date: 2019/9/22
 * Time: 18:47
 * Description:
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableSwagger2
@EnableFeignClients
public class LookListApiApplicantion {
    public static void main(String[] args) {
        SpringApplication.run(LookListApiApplicantion.class, args);
    }
}
