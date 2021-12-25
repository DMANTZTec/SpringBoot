package com.dmantz.springboot.jpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dmantz.springboot.jpa.entity.Department;

@Service
public interface DepartmentService {
	
	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId);

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);



}
