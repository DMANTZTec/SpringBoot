package com.dmantz.springboot.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringbootsecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootsecurityApplication.class, args);
	}
	@Bean
    public PasswordEncoder passwordEncoder() {
	    return NoOpPasswordEncoder.getInstance();
    
    }
}
