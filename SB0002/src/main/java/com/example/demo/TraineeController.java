package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TraineeController {
	@GetMapping
	public Trainee getDetails()
	{
		return new Trainee("Amulya","amulyamadupoju14@gmail.com");
	}

    @GetMapping("/hello")
    public String sayHi() {
		return "Hi";
    }
    @GetMapping("/hey")
    public List<String> hello(){
    	return List.of("Hi", "Amulya");
    }
}
		
    