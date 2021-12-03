package com.dmantz.springbootjdbcdemo.DAO;


import java.util.List;

import com.dmantz.springbootjdbcdemo.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();
}
