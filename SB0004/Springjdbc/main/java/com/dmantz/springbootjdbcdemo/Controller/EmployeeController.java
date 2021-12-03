package com.dmantz.springbootjdbcdemo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.springbootjdbcdemo.DAO.EmployeeDAO;
import com.dmantz.springbootjdbcdemo.entity.Employee;



@RestController
public class EmployeeController {
	
	@Autowired 
	private EmployeeDAO eDAO;
	
	@GetMapping(path="/employees")
	public List<Employee> findAll() {
		return eDAO.findAll();
	}
}
