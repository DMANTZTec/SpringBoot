package com.dmantz.vamshi.common.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.vamshi.common.entity.Customer;

@RestController
public class CustomerController {
	@PostMapping("/test")
	public String test(@Valid@RequestBody Customer customer)
	{
		return "success";
	}

}
   