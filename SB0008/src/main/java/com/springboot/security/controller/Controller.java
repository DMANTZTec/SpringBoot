package com.springboot.security.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
		
		@GetMapping("/")
		public String anyLogin() {
			return ("Welcome");
		}
			
			@GetMapping("/user")
			public String userLogin() {
				return ("Welcome User");
			
		}
			
			@GetMapping("/admin")
			@PreAuthorize("hasRole('ADMIN')")
			public String adminLogin() {
				return ("Welcome Admin");
			
		}
		

	}

