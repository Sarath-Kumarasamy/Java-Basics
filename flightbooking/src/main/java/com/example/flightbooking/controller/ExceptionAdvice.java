package com.example.flightbooking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.flightbooking.exception.InsufficientBalanceErrorMsg;
import com.example.flightbooking.exception.InsufficientFundException;
import com.example.flightbooking.exception.PassengerInfoErrormsg;
import com.example.flightbooking.exception.PassengerInfoException;

@ControllerAdvice
public class ExceptionAdvice extends ResponseEntityExceptionHandler 
{
	@ExceptionHandler(InsufficientFundException.class)
	public ResponseEntity<InsufficientBalanceErrorMsg> insufficientBalance(InsufficientFundException ix)
	{
		InsufficientBalanceErrorMsg errmsg = new InsufficientBalanceErrorMsg(HttpStatus.BAD_REQUEST.value(), ix.getMessage());
		return new ResponseEntity<InsufficientBalanceErrorMsg>(errmsg,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<PassengerInfoErrormsg> passengerInfo(PassengerInfoException px)
	{
		PassengerInfoErrormsg passerrmsg = new PassengerInfoErrormsg(HttpStatus.NOT_FOUND.value(),px.getMessage());		
		return new ResponseEntity<PassengerInfoErrormsg>(passerrmsg,HttpStatus.NOT_FOUND);
	}
}











