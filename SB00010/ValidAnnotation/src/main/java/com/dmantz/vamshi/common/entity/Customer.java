package com.dmantz.vamshi.common.entity;

import javax.validation.constraints.Email;
//import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	@NotNull
	@Email
	@Size(min=17)  
	private String customerName;
	@NotNull
	@Pattern(regexp="^[a-zA-Z0-9]{8}",message="length must be 8")  
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
