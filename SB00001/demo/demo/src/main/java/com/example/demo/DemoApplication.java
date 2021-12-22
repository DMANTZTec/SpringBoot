package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.sub.component;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext app=SpringApplication.run(DemoApplication.class, args);
		component comp=app.getBean(component.class);
		System.out.println(comp.getMessage());
	}

}
