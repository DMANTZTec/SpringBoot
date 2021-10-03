package src.main.java.com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ExampleApplication.class, args);
		Customers c=context.getBean(Customers.class);
		c.display();
	}

}
