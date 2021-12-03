package com.dmantz.springbootjdbcdemo.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dmantz.springbootjdbcdemo.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Employee> findAll() {
		return jdbcTemplate.query("SELECT * FROM springbootjdbc.tbl_employees", new BeanPropertyRowMapper<Employee>(Employee.class));
	}	
}
