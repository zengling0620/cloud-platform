package com.it.eureka;

import com.it.core.Pretty;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @desc: ${类描叙}
 * @author: 90003995
 * @date: 2022-01-06 16:10
 */
@Slf4j
@EnableAdminServer
@EnableEurekaServer
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaApplication {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Pretty.welcome(SpringApplication.run(EurekaApplication.class, args));
        log.info("注册中心服务启动成功耗时：{}", (System.currentTimeMillis() - startTime) / 1000 + "秒");
    }
}
