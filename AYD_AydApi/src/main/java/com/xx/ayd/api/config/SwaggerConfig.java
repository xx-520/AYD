package com.xx.ayd.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/16
 * Time: 21:20
 */
@Configuration
public class SwaggerConfig {
    private ApiInfo createAI() {
        return new ApiInfoBuilder()
                .title("悦微易读数据接口").description("基于SpringCloud实现的小说微服务项目！")
                .version("0.1")
                .contact(new Contact("xx", "http://222","ymx777@aliyun.com")).build();
    }

    @Bean
    public Docket createD(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createAI()).select().apis
                (RequestHandlerSelectors.basePackage("com.xx.ayd.api.controller")).build();
    }
}
