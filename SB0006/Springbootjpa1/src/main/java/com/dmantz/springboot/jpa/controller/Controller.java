package com.dmantz.springboot.jpa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@PostMapping("/test")
	public String post() {
		return "swagger config test";
	}
}
