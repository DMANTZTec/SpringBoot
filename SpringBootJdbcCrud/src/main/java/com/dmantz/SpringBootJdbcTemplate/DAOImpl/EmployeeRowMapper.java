package com.dmantz.SpringBootJdbcTemplate.DAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dmantz.SpringBootJdbcTemplate.Model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee=new Employee();
		employee.setEmployeeId(rs.getInt("employeeId"));
		employee.setEmployeeName(rs.getString("employeeName"));
		employee.setEmail(rs.getString("email"));
		employee.setSalry(rs.getDouble("salary"));
		return employee;
	}

}
