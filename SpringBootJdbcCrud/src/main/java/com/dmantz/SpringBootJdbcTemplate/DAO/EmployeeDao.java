package com.dmantz.SpringBootJdbcTemplate.DAO;

import com.dmantz.SpringBootJdbcTemplate.Model.Employee;

public interface EmployeeDao {
	
	public abstract void createEmployee(Employee employee); 
	public abstract Employee getEmployeeById(Integer employeeId); 
	public abstract void updateEmployeeEmailById(Integer employeeId,String newEmail); 
	public abstract void deleteEmployeeById(Integer employeeId); 
}
