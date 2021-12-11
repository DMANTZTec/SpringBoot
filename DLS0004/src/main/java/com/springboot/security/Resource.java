package com.springboot.security;

import org.springframework.web.bind.annotation.GetMapping;

public class Resource {
	
	@GetMapping("/hello")
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
