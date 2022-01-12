package com.dmantz.springboot.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.springboot.jdbc.dao.EmployeeDao;
import com.dmantz.springboot.jdbc.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDao Employeedao;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return Employeedao.getAll();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable int id  ) {
		return Employeedao.getById(id);
	}
	@PostMapping("/employees")
	public String saveEmployee(@RequestBody Employee employee ) {
		return Employeedao.save(employee)+"No.of rows saved to database";
	}
	
	@PutMapping("/employees/{id}")
	public String updateEmployee(@RequestBody Employee employee, @PathVariable int id ) {
		return Employeedao.update(employee, id)+"No.of rows updated to database";
	}
	@DeleteMapping("/employees/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		 return Employeedao.delete(id)+ "No.of rows deleted to database";
	}

}
