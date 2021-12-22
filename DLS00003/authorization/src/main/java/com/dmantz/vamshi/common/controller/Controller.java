package com.dmantz.vamshi.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
	public String hello()
	{
		return "hello";
	}
	
	@GetMapping("/user")
	public String user()
	{
		return "hello user/admin";
	}
	
	@GetMapping("/admin")
	public String admin()
	{
		return "hello admin";
	}


	

}
