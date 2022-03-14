package com.example.flightbooking.dto;

import com.example.flightbooking.model.PassengerInfo;

import io.swagger.annotations.ApiModel;

@ApiModel(value="Model DTO class for sharing acknowledged info")
public class FlightBookingAcknowledgement 
{
	private int paymentId;
	private String status;
	private Integer amt;
	PassengerInfo passengerinfo;
	

	public FlightBookingAcknowledgement(int paymentId, String status, Integer amt, PassengerInfo passengerinfo) {
		super();
		this.paymentId = paymentId;
		this.status = status;
		this.amt = amt;
		this.passengerinfo = passengerinfo;
	}
	public PassengerInfo getPassengerinfo() {
		return passengerinfo;
	}
	public void setPassengerinfo(PassengerInfo passengerinfo) {
		this.passengerinfo = passengerinfo;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getAmt() {
		return amt;
	}
	public void setAmt(Integer amt) {
		this.amt = amt;
	}
	
}
