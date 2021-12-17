package com.springboot.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.springboot.security.User")
@SpringBootApplication
public class SpringbSecurityLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbSecurityLoginApplication.class, args);
	}

}
