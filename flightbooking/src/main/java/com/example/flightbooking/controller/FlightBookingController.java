package com.example.flightbooking.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightbooking.exception.PassengerInfoException;
import com.example.flightbooking.model.PassengerInfo;
import com.example.flightbooking.repository.PassengerInfoRepository;
import com.example.flightbooking.repository.PaymentInfoRepository;
import com.example.flightbooking.service.FlightBookingService;

@RestController
public class FlightBookingController 
{
	@Autowired
	PassengerInfoRepository passengerinforepo;
	@Autowired
	PaymentInfoRepository paymentinforepo;
	
	@Autowired
	FlightBookingService flightbookingservice;	
	
	@PostMapping("/addPassenger")
	public PassengerInfo addPasenger(@RequestBody PassengerInfo passenger)
	{
		passengerinforepo.save(passenger);
		return passenger;
	}
	
	@GetMapping("/passenger/{pid}")
	public Optional<PassengerInfo> getPassengerInfo(@PathVariable int pid) 
	{
			if (flightbookingservice.getPassengerInfo(pid) == null )
			{
				throw new PassengerInfoException("passenger not found");
			}
		return flightbookingservice.getPassengerInfo(pid);
	}
	
}
