package com.it.config;

import com.it.core.Pretty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZL
 * @menu todo
 * @date 2021/9/3 11:37
 */
@Slf4j
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Pretty.welcome(SpringApplication.run(ConfigApplication.class, args));
        log.info("配置中心服务启动耗时：{}", (System.currentTimeMillis() - startTime) / 1000 + "秒");
    }

}
