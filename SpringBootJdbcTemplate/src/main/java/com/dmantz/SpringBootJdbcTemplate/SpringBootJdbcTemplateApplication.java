package com.dmantz.SpringBootJdbcTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.dmantz.controller","com.dmantz.userrepository"})
public class SpringBootJdbcTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcTemplateApplication.class, args);
	}

}

