package com.dmantz.camelapplication;

import java.util.concurrent.TimeUnit;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class CamelApplication {

	public static void main(String[] args) throws Exception  {
		SpringApplication.run(CamelApplication.class, args);


		CamelContext context =new DefaultCamelContext();

		ConnectionFactory connectionFactory=new ActiveMQConnectionFactory();
		context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
        
		
		
		context.addRoutes(new RouteBuilder(){

			@Override
			public void configure() throws Exception {

				from("file:input_box?noop=true")
				.to("activemq:queue:my_queue").end();

			}

		}); 

			context.start();
			TimeUnit.MINUTES.sleep(1);

			
            //If you do not want to see these logs, 
			//you can suppress this by setting the option SuppressLoggingOnTimeout to true.
			//context.getShutdownStrategy().setSuppressLoggingOnTimeout(true);
	        //Thread.sleep(1000);
			context.stop();
	}		 

}