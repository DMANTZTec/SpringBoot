package com.dmantz.SpringBootJdbcTemplate.DAOImpl;



import java.io.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dmantz.SpringBootJdbcTemplate.DAO.EmployeeDao;
import com.dmantz.SpringBootJdbcTemplate.Model.Employee;



@Repository
public class EmployeeDaoImpl implements EmployeeDao {
   
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//private static  Logger logger=Logger.getLogger(EmployeeDaoImpl.class);
	
	@Override
	public void createEmployee(Employee employee) {
		
		//logger.info("Creating Employee");
		System.out.println("Creating Employee");
		
      String CREATE_EMPLOYEE_SQL="INSERT INTO employee_table(employeeId,employeeName,email,salary) VALUES(?,?,?,?)";
      int update=jdbcTemplate.update(CREATE_EMPLOYEE_SQL,employee.getEmployeeId(), employee.getEmployeeName(),employee.getEmail(),employee.getSalry());
      
      if(update == 1) {
    	  
    	  //logger.info("Employee is created");
    	  System.out.println("Employee is created");
      }
	}

	@Override
	public Employee getEmployeeById(Integer employeeId) {
		
		//logger.info("Getting Employee"); 
		 System.out.println("Getting Employee");
		 String GET_EMPLOYEE_SQL="SELECT * FROM  employee_table WHERE employeeId=?";
	      Employee employee=jdbcTemplate.queryForObject(GET_EMPLOYEE_SQL,new EmployeeRowMapper(),employeeId);
	     // logger.info(" Employee is Retrived");
	      System.out.println("Employee is retrived");
		   return employee;		  
	}

	@Override
	public void updateEmployeeEmailById(Integer employeeId, String newEmail) {
		//logger.info("Updating  Employee"); 
		System.out.println("Updating Employee");
		String UPDATE_EMPLOYEE_SQL="UPDATE  employee_table  set employeeId=?  WHERE email=?";
	     int update=jdbcTemplate.update(UPDATE_EMPLOYEE_SQL,employeeId,newEmail);
	      
	      if(update == 0) {
	    	  
	    	  //logger.info("Employee is Updated");
	    	  System.out.println("Employee is Updated");
		}

	      
	      
	            
 }     
	

	@Override
	public void deleteEmployeeById(Integer employeeId) {
		
		//logger.info("Deleting Employee"); 
		 System.out.println("Deleting Employee");
		
		String DELETE_EMPLOYEE_SQL="DELETE FROM	 employee_table  WHERE employeeId=?";
	      int update=jdbcTemplate.update(DELETE_EMPLOYEE_SQL,employeeId);
	
	      if(update == 1) {
	    	  
	    	//  logger.info("Employee is Deleted");
	    	  System.out.println("Employee is Deleted");
	    	  
		}
		

	}

}
