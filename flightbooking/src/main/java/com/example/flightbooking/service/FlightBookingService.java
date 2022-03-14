package com.example.flightbooking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flightbooking.exception.PassengerInfoException;
import com.example.flightbooking.model.PassengerInfo;
import com.example.flightbooking.repository.PassengerInfoRepository;

@Service
public class FlightBookingService 
{
	@Autowired
	PassengerInfoRepository passengerinforepo;
	
	public Optional<PassengerInfo> getPassengerInfo(int pid) throws PassengerInfoException
	{
		return passengerinforepo.findById(pid);
	}
}