package com.it.oauth;

import com.it.core.Pretty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class UaaServerApp {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Pretty.welcome(SpringApplication.run(UaaServerApp.class, args));
        log.info("Spring Boot Admin Server 服务启成功动耗时：{}", (System.currentTimeMillis() - startTime) / 1000 + "秒");
    }

}
