package com.example.flightbooking.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightbooking.dto.FlightBookingAcknowledgement;
import com.example.flightbooking.dto.FlightBookingPortal;
import com.example.flightbooking.model.PassengerInfo;
import com.example.flightbooking.model.PaymentInfo;
import com.example.flightbooking.repository.PassengerInfoRepository;
import com.example.flightbooking.repository.PaymentInfoRepository;
import com.example.flightbooking.utils.PaymentValidator;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/FlightBooking")
public class FlightBookingAppController 
{
	@Autowired
	PassengerInfoRepository passengerinforepo;
	
	@Autowired
	PaymentInfoRepository paymentinforepo;
	
	@PostMapping("/CreateTicket")
	@Transactional
	@ApiOperation(value = "Request to update new passenger & payment details in database")
	public FlightBookingAcknowledgement bookingPortal(@ApiParam(value="Please provide passenger & payment details", required=true) @RequestBody FlightBookingPortal bookingDetails)
	{
		PassengerInfo pass_details = bookingDetails.getPassengerinfo();
		PaymentInfo payment_details = bookingDetails.getPaymentinfo();
		
		passengerinforepo.save(pass_details);
		
		PaymentValidator.paymentValidate(payment_details.getAccno(), payment_details.getAmt());
		
		payment_details.setPass_id(pass_details.getPass_id());
		paymentinforepo.save(payment_details);
		
		return new FlightBookingAcknowledgement(payment_details.getPaymentId(),"Success",payment_details.getAmt(),pass_details);
	}
	
	@GetMapping("/passengerlist")
	public List<PassengerInfo> getPassengers()
	{
		return passengerinforepo.findAll();
	}
}
