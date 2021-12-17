package com.springboot.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
		
		@GetMapping("/")
		public String anyLogin() {
			return ("Welcome");
		}
			
			@GetMapping("/user")
			public String userLogin() {
				return ("Welcome User");
			
		}
			
			@GetMapping("/admin")
			public String adminLogin() {
				return ("Welcome Admin");
			
		}
		

	}

