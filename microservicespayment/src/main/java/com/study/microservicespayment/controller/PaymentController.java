package com.study.microservicespayment.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.microservicespayment.model.Payment;
import com.study.microservicespayment.repository.PaymentRepository;

@RestController
public class PaymentController 
{
	@Autowired
	PaymentRepository paymentrepo;
	
	@PostMapping("/processPayment")
	public Payment processPayment(@RequestBody Payment paymentdetails)
	{
		return paymentrepo.save(paymentdetails);
	}
	
	
}
