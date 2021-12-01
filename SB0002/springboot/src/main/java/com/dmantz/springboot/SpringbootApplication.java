package com.dmantz.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dmantz.springboot.sub1.SpringComponent;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =SpringApplication.run(SpringbootApplication.class, args);
		SpringComponent component =  applicationContext.getBean(SpringComponent.class);
		System.out.println(component.getMessage());
	}

}
