package com.dmantz.vamshi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.vamshi.Repository.Userrepository;

@RestController
@RequestMapping(path="/w")
public class UserController {
	@Autowired
	Userrepository userrepository;
	
	@GetMapping
	public String Check() {
		return "welcome";
	}
	@GetMapping(path="/getnames")
  public List<String> getAllUserNames(){
	  return userrepository.getAllNames();
  }
	
	@GetMapping(path="/getages")
	public List<String> getAllUserMails(){
		return userrepository.getAllAges();
	}
}
