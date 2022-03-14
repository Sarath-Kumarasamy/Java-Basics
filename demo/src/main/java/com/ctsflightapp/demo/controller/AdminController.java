package com.ctsflightapp.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctsflightapp.demo.Service.AdminService;
import com.ctsflightapp.demo.modal.Flight;

@RestController
@RequestMapping("/api/v1.0/flight")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/admin/login/{username}/{password}")
	public String adminLogin(@PathVariable String username, @PathVariable String password)
	{
		return adminService.login(username, password);
	}
	
	@PostMapping("/airline/inventory/add") 
	public Flight addFlight(@RequestBody Flight newFlight) {
		adminService.addFlight(newFlight);
		return newFlight;
	}
	
	@DeleteMapping("/airline/inventory/delete/{id}")
	public Optional<Flight> removeFlight(@PathVariable int id)
	{
		Optional<Flight> f1=adminService.findFlightById(id);
		adminService.removeFlight(f1);
		return f1;
	}

}
