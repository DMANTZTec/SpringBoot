package com.dmantz.WelcomeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.WelcomeService.WelcomeService;

@RestController
public class WelcomeController {
	
	@Autowired
	private WelcomeService service;
	
	/*@RequestMapping("/welcome")
	public String welcome() {
		
		return service.getWelcomeMessage();
		
	}
		
*/		//Pass the value throgh url using method parameter 
			@GetMapping(path="/welcome/{name}")
			public String welcome(@PathVariable String name) {
				
				return name+" , "+ service.getWelcomeMessage();
				
		}
	
  }



