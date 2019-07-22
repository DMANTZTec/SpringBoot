package com.dmantz.highchart.csv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication(scanBasePackages= {"com.dmantz.highchart.csv.controller"})
public class HighchartCsvApplication {

	public static void main(String[] args) {
		SpringApplication.run(HighchartCsvApplication.class, args);
	}

}
