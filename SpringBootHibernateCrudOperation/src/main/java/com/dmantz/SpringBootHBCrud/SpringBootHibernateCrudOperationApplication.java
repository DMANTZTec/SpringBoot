package com.dmantz.SpringBootHBCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication(scanBasePackages= {"com.dmantz.SpringBootHBCrud.Dao","com.dmantz.SpringBootHBCrud.Controller"})
@EnableCaching
public class SpringBootHibernateCrudOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateCrudOperationApplication.class, args);
	}

}

