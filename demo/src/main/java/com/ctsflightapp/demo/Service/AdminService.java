package com.ctsflightapp.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctsflightapp.demo.Repository.FlightRepository;
import com.ctsflightapp.demo.modal.Flight;
import com.ctsflightapp.demo.utils.AdminCredentials;

@Service
public class AdminService {
	
	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private AdminCredentials adminCredentials;
		
	public String login(String userName, String Password) {
		
		return adminCredentials.login(userName, Password);
	}

	public Flight addFlight(Flight newFlight) {
		return flightRepo.save(newFlight);
	}

	public Optional<Flight> findFlightById(int id) {
		return flightRepo.findById(id);
	}

	public void removeFlight(Optional<Flight> f1) {
		flightRepo.delete(f1);
		return ;
	}

}
