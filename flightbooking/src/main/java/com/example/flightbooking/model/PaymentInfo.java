package com.example.flightbooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(value="Model class for Payment info")
public class PaymentInfo 
{
	@Id
	@GeneratedValue
	private int paymentId;
	private String accno;
	private Integer amt;
	private int pass_id;
	
	public int getPass_id() {
		return pass_id;
	}
	public void setPass_id(int i) {
		this.pass_id = i;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public Integer getAmt() {
		return amt;
	}
	public void setAmt(Integer amt) {
		this.amt = amt;
	}
	
	
}
