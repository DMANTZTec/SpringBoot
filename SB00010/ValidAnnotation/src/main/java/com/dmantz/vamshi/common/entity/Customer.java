package com.dmantz.vamshi.common.entity;

import javax.validation.constraints.NotNull;

public class Customer {
	@NotNull
	private String customerName;
	@NotNull
	private String password;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
