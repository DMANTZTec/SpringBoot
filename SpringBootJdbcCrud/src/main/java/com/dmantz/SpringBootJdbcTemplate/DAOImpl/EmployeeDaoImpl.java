package com.dmantz.SpringBootJdbcTemplate.DAOImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dmantz.SpringBootJdbcTemplate.DAO.EmployeeDao;
import com.dmantz.SpringBootJdbcTemplate.Model.Employee;

import ch.qos.logback.core.net.SyslogOutputStream;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
   
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void createEmployee(Employee employee) {
		System.out.println("Creating Employee"); 
      String CREATE_EMPLOYEE_SQL="INSERT INTO employee_table(employeeId,employeeName,email,salary) VALUES(?,?,?,?)";
      int update=jdbcTemplate.update(CREATE_EMPLOYEE_SQL,employee.getEmployeeId(), employee.getEmployeeName(),employee.getEmail(),employee.getSalry());
      
      if(update == 1) {
    	  
    	  System.out.println("Employee is cretaed");      }
	}

	@Override
	public Employee getEmployeeById(Integer employeeId) {
		
		System.out.println("Getting Employee"); 
		 String GET_EMPLOYEE_SQL="SELECT * FROM  employee_table WHERE employeeId=?";
	      Employee employee=jdbcTemplate.queryForObject(GET_EMPLOYEE_SQL,new EmployeeRowMapper(),employeeId);
	      System.out.println("Employee is Retrived");
		   return employee;		  
	}

	@Override
	public void updateEmployeeEmailById(Integer employeeId, String newEmail) {
		System.out.println("Updating Employee");
		String UPDATE_EMPLOYEE_SQL="UPDATE  employee_table  set email=?  WHERE  employeeId=?";
	     int update=jdbcTemplate.update(UPDATE_EMPLOYEE_SQL,employeeId,newEmail);
	      
	      if(update == 1) {
	    	  
	    	  System.out.println("Employee is Updated");      
		}

	      
	      
	            
 }     
	

	@Override
	public void deleteEmployeeById(Integer employeeId) {
		
		System.out.println("Deleting Employee");
		
		String DELETE_EMPLOYEE_SQL="DELETE FROM	 employee_table  WHERE employeeId=?";
	      int update=jdbcTemplate.update(DELETE_EMPLOYEE_SQL,employeeId);
	
	      if(update == 1) {
	    	  
	    	  System.out.println("Employee Is Deleted");      
	    	  
		}
		

	}

}
