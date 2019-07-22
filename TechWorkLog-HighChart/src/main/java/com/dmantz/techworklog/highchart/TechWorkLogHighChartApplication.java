package com.dmantz.techworklog.highchart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
	
@SpringBootApplication(scanBasePackages={"com.dmantz.techworklog.controller","com.dmantz.techworklog.service"})
@EntityScan("com.dmantz.techworklog.model")
@EnableJpaRepositories("com.dmantz.techworklog.Repository")
public class TechWorkLogHighChartApplication  {
	
	public static void main(String[] args) {
		SpringApplication.run(TechWorkLogHighChartApplication.class, args);
	}

}
