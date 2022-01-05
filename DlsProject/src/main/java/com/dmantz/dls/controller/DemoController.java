package com.dmantz.dls.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	@RequestMapping("/test")
	public String post() {
		return "swagger config test";
	}
}
