package com.example.flightbooking.exception;

public class InsufficientFundException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -214977551312355147L;

	public InsufficientFundException(String msg)
	{
		super(msg);
	}
}
