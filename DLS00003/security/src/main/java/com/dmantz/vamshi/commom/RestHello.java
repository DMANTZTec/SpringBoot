package com.dmantz.vamshi.commom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHello {
	@GetMapping("/hello-word")
	public String helloMessage()
	{
		return "Hello babai";
	}

}