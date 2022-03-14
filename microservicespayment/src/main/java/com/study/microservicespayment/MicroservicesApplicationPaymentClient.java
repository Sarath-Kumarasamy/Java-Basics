package com.study.microservicespayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicesApplicationPaymentClient {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesApplicationPaymentClient.class, args);
	}

}
