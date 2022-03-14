package com.example.flightbooking.dto;

import com.example.flightbooking.model.PassengerInfo;
import com.example.flightbooking.model.PaymentInfo;

import io.swagger.annotations.ApiModel;

@ApiModel(value="Model DTO class for booking flight ticket")
public class FlightBookingPortal 
{
	PassengerInfo passengerinfo;
	PaymentInfo paymentinfo;
	
	public PassengerInfo getPassengerinfo() {
		return passengerinfo;
	}
	public void setPassengerinfo(PassengerInfo passengerinfo) {
		this.passengerinfo = passengerinfo;
	}
	public PaymentInfo getPaymentinfo() {
		return paymentinfo;
	}
	public void setPaymentinfo(PaymentInfo paymentinfo) {
		this.paymentinfo = paymentinfo;
	}
	
	
}
