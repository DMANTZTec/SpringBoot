package com.dmantz.springboot.jpa.service;

import org.springframework.stereotype.Service;

import com.dmantz.springboot.jpa.entity.Department;

@Service
public interface DepartmentService {
	
	public Department saveDepartment(Department department);

}
