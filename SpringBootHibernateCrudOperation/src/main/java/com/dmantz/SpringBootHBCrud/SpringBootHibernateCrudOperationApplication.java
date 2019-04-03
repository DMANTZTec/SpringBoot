package com.dmantz.SpringBootHBCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootHibernateCrudOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateCrudOperationApplication.class, args);
	}

}

