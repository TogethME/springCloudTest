package com.xdd.cn.xiangdangdang;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Administrator
 */
@EnableEurekaServer
@SpringBootApplication
public class XDDEurekaApplication {

	public static void main(String[] args) {
			new SpringApplicationBuilder(XDDEurekaApplication.class).web(true).run(args);
	}

}
