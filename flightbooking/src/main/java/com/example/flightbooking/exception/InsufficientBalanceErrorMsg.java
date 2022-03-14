package com.example.flightbooking.exception;

public class InsufficientBalanceErrorMsg 
{
	private int errorcode;
	private String errormsg;
	private String errorpath;
	
	
	public InsufficientBalanceErrorMsg(int errorcode, String errormsg) {
		super();
		this.errorcode = errorcode;
		this.errormsg = errormsg;
		//this.errorpath = errorpath;
	}

	public String getErrorpath() {
		return errorpath;
	}

	public void setErrorpath(String errorpath) {
		this.errorpath = errorpath;
	}

	public int getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}
	public String getErrormsg() {
		return errormsg;
	}
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	
	
}
