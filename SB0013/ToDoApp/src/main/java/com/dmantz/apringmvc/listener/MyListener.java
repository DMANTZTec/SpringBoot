package com.dmantz.apringmvc.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.dmantz.apringmvc.entity.Todo;

public class MyListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		System.out.println("context created....");
		
		List<Todo> list=new ArrayList<Todo>();
		ServletContext context=sce.getServletContext();
		context.setAttribute("list", list);
		
		
	}

}
