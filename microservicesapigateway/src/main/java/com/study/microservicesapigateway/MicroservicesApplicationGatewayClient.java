package com.study.microservicesapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class MicroservicesApplicationGatewayClient {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesApplicationGatewayClient.class, args);
	}
	
}
