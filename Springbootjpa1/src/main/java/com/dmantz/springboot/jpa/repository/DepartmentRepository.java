package com.dmantz.springboot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmantz.springboot.jpa.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
