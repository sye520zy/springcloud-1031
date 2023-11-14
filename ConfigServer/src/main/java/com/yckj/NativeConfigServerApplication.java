package com.yckj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer // 声明一个配置中心
public class NativeConfigServerApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(NativeConfigServerApplication.class, args);
	}

}
