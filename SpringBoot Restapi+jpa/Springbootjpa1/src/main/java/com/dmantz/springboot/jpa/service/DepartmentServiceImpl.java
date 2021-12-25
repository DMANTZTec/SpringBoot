package com.dmantz.springboot.jpa.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.springboot.jpa.entity.Department;
import com.dmantz.springboot.jpa.repository.DepartmentRepository;


@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}
	
	@Override
	public List<Department> fetchDepartmentList() {
		
		return departmentRepository.findAll();
		
	}
	
	@Override
	public Department fetchDepartmentById(Long departmentId) {
		
		return departmentRepository.findById(departmentId).get();
	}
	
	@Override
	public void deleteDepartmentById(Long departmentId) {
		
		departmentRepository.deleteById(departmentId);
		
	}
	@Override
	public Department updateDepartment(Long departmentId, Department department) {
		
		Department depDB = departmentRepository.findById(departmentId).get();
		
		if(Objects.nonNull(department.getDepartmentNmae()) &&
		!"".equalsIgnoreCase(department.getDepartmentNmae())) {
			depDB.setDepartmentNmae(department.getDepartmentNmae());
		}
		
		if(Objects.nonNull(department.getDepartmentAddress()) &&
				!"".equalsIgnoreCase(department.getDepartmentAddress())) {
					depDB.setDepartmentAddress(department.getDepartmentAddress());
		}
		if(Objects.nonNull(department.getDepartmentCode()) &&
				!"".equalsIgnoreCase(department.getDepartmentCode())) {
					depDB.setDepartmentCode(department.getDepartmentCode());
		}
		return departmentRepository.save(depDB);
	}
}
