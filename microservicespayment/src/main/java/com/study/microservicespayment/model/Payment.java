package com.study.microservicespayment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Payment_TB")
public class Payment 
{
	@Id
	@GeneratedValue
	private int p_id;
	private String p_status;
	private int p_amt;
	private int o_id;
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int pid) {
		this.p_id = pid;
	}
	public String getP_status() {
		return p_status;
	}
	public void setP_status(String p_status) {
		this.p_status = p_status;
	}
	public int getP_amt() {
		return p_amt;
	}
	public void setP_amt(int p_amt) {
		this.p_amt = p_amt;
	}
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
}
