package com.fast.core.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import com.fast.base.spring.ServiceClientConfiguration;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@Import({ServiceClientConfiguration.class})
public class FastApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastApplication.class, args);
//		new SpringApplicationBuilder(FastApplication.class).web(true).run(args);
	}
	
	@Component
	class LoadBalancerExample implements CommandLineRunner {

	    @Autowired
	    private LoadBalancerClient loadBalancer;

	    public void run(String... strings) throws Exception {
	    	System.out.println(loadBalancer.toString());
	    }
	}
	
}