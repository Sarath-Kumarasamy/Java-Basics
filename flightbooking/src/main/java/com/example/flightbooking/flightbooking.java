package com.example.flightbooking;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableTransactionManagement
@EnableAspectJAutoProxy
@EnableSwagger2

public class flightbooking {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(flightbooking.class, args);
	}
	
	@Bean
	public Docket getDocket()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/FlightBooking/*"))
				.apis(RequestHandlerSelectors.basePackage("com.example.flightbooking"))
				.build()
				.apiInfo(apiInfoDetails());		
	}
	
	private ApiInfo apiInfoDetails()
	{
		return new ApiInfo("FlightBooking",
				"API for booking flights",
				"1.0", 
				"https://swagger.io/docs/specification/api-general-info/",
				new springfox.documentation.service.Contact("Sarath","https://swagger.io", "sarathkumarasamy@gmail.com"), 
				"API License",
				"https://swagger.io/docs/", 
				Collections.emptyList());
	}

}
