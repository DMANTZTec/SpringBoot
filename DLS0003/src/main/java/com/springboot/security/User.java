package com.springboot.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
	
	@GetMapping("/hello")
	public String userLogin() {
		return ("Welcome User");
		
	}
	

}
