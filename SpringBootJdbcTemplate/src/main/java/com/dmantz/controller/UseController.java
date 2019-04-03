package com.dmantz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.userrepository.UserRepository;

@RestController
@RequestMapping("/user")
public class UseController {
	@Autowired
	 UserRepository userrepository;
	
	@GetMapping
	public String check() {
		
		return "Welcome to JavaInspire";
		
		
	}
	
	@GetMapping(path="/getusernames")
	public List getAllUserNames(){
		return userrepository.getAllUserNames();
		
	}

}
