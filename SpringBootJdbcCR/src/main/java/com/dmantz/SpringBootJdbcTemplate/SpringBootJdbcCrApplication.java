package com.dmantz.SpringBootJdbcTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.dmantz.CricketProfile.Controller","com.dmantz.CricketProfile.DAO",
		"com.dmantz.CricketProfile.Model"})
public class SpringBootJdbcCrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcCrApplication.class, args);
	}

}

