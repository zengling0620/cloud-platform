package com.it.admin;

import com.it.core.Pretty;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZL
 * @menu todo
 * @date 2021/9/3 11:37
 */
@Slf4j
@EnableAdminServer
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class AdminServerApplication {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Pretty.welcome(SpringApplication.run(AdminServerApplication.class, args));
        log.info("Spring Boot Admin Server 服务启成功动耗时：{}", (System.currentTimeMillis() - startTime) / 1000 + "秒");
    }

}
