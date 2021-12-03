package com.dmantz.springboot.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.springboot.jdbc.repository.UserRepository;

@RestController
@RequestMapping(path="/user")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@GetMapping
	public String check() {
		return "Welcome to springboot";
	}
	@GetMapping(path="/c")
	public List<String> getAllUserNames() {
		return userRepository.getAllUserNames();
		
	}

}
