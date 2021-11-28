package com.Springboot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SampleController {
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi Amulya";
		
	}

}
