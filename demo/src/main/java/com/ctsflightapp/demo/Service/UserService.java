/**
 * 
 */
package com.ctsflightapp.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctsflightapp.demo.Repository.FlightRepository;

/**
 * @author Sarath
 *
 */

@Service
public class UserService {
	
	@Autowired
	private FlightRepository flightRepo;

}
