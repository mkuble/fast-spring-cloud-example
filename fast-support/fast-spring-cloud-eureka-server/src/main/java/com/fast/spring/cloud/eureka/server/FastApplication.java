package com.fast.spring.cloud.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FastApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(FastApplication.class).web(true).run(args);
	}
	
}
