package com.study.microservicesapigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController 
{

	@GetMapping("/orderfallback")
	public String orderfallback()
	{
		return "Order service is down";
	}
	
	@GetMapping("/paymentfallback")
	public String paymentfallback()
	{
		return "Payment service is down";
	}
}
