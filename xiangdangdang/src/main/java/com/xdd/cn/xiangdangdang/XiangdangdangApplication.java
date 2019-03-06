package com.xdd.cn.xiangdangdang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 */
@EnableDiscoveryClient
@SpringBootApplication
public class XiangdangdangApplication {

	public static void main(String[] args) {
		SpringApplication.run(XiangdangdangApplication.class, args);
	}

}
