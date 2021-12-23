package com.dmantz.vamshi.common.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.vamshi.common.entity.Customer;

@RestController
public class CustomerController {
	@RequestMapping(value = "testing", method = RequestMethod.POST)
	public String test(@Valid@RequestBody Customer customer)
	{
		return "success";
	}

}
