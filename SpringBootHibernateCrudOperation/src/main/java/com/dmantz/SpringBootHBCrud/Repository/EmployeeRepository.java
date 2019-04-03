package com.dmantz.SpringBootHBCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmantz.SpringBootHBCrud.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

        
 
}
