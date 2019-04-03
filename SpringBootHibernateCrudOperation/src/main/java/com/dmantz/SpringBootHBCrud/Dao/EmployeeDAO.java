package com.dmantz.SpringBootHBCrud.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.SpringBootHBCrud.Model.Employee;
import com.dmantz.SpringBootHBCrud.Repository.EmployeeRepository;

@Service
public class EmployeeDAO {
	

	
	@Autowired
	EmployeeRepository employeeRepository;
	
	/*To Save an Employe*/
	
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
		
	}
		
		/*To search all Employees*/
		
		public List<Employee> findAll() {
			return employeeRepository.findAll();
		}
		
		
		/*To Search one Employee*/
		
		public Employee findOne(Long empid) {
			
			return employeeRepository.getOne(empid);
		}
		
		/*Delete an Employee*/
		
		public void delete(Employee emp) {
			
			employeeRepository.delete(emp);
		}
		
		
	}


