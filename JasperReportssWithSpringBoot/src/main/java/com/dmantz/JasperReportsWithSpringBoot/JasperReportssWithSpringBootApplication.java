package com.dmantz.JasperReportsWithSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"com.dmantz.Services","com.dmantz.JasperReportsWithSpringBoot.Controller"})
@EntityScan("com.dmantz.Entities")
@EnableJpaRepositories("com.dmantz.Repositories")
public class JasperReportssWithSpringBootApplication {
	
	
  public static void main(String[] args) {
		SpringApplication.run(JasperReportssWithSpringBootApplication.class, args);
	}

}
