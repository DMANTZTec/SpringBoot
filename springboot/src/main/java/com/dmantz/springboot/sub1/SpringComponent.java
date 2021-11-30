package com.dmantz.springboot.sub1;

import org.springframework.stereotype.Component;

@Component
public class SpringComponent {
	public String getMessage() {
		return "hello world!"; 
	}
}
