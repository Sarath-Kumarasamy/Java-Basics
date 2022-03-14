package com.example.flightbooking.utils;

import java.util.HashMap;
import java.util.Map;

import com.example.flightbooking.exception.InsufficientFundException;

public class PaymentValidator 
{
	private static Map<String,Integer> acc_balance = new HashMap<>();
	
	static {
		acc_balance.put("acc1", 10000);
		acc_balance.put("acc2", 5000);
		acc_balance.put("acc3", 12000);
		acc_balance.put("acc4", 8000);
	}
	
	public static boolean paymentValidate(String accno, Integer amt)
	{
		if(amt > acc_balance.get(accno))
			throw new InsufficientFundException("Insufficient fund da venna !") ;
		else
			return true;
	}

}
