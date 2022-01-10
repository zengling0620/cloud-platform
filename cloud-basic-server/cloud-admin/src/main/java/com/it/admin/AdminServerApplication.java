package com.it.admin;

import com.it.core.Pretty;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @desc: ${类描叙}
 * @author: 90003995
 * @date: 2022-01-06 16:10
 */
@Slf4j
@EnableAdminServer
@EnableEurekaClient
@SpringBootApplication
public class AdminServerApplication {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Pretty.welcome(SpringApplication.run(AdminServerApplication.class, args));
        log.info("SpringBoot Admin 服务启动成功耗时：{}", (System.currentTimeMillis() - startTime) / 1000 + "秒");
    }
}
