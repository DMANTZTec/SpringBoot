package com.dmantz.springjdbcdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.springjdbcdemo.repository.UserRepository;

@RestController
@RequestMapping(path="/w")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@GetMapping
	public String Check() {
		return "welcome";
	}
	@GetMapping(path="/get")
  public List<String> getAllUserNames(){
	  return userRepository.getAllUserNames();
  }
}
