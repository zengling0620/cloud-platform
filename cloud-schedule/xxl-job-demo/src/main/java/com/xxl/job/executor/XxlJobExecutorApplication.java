package com.xxl.job.executor;

import com.it.core.Pretty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xuxueli 2018-10-28 00:38:13
 */
@Slf4j
@SpringBootApplication
public class XxlJobExecutorApplication {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Pretty.welcome(SpringApplication.run(XxlJobExecutorApplication.class, args));
		log.info("xxl-job-client 服务启成功动耗时：{}", (System.currentTimeMillis() - startTime) / 1000 + "秒");
	}
}