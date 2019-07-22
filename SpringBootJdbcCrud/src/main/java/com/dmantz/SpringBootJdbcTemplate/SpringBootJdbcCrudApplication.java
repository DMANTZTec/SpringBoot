package com.dmantz.SpringBootJdbcTemplate;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.SpringBootJdbcTemplate.DAO.EmployeeDao;
import com.dmantz.SpringBootJdbcTemplate.Model.Employee;

@SpringBootApplication
@RestController
@RequestMapping("/user")
public class SpringBootJdbcCrudApplication implements CommandLineRunner {
	
	
	//private static  Logger logger=Logger.getLogger(EmployeeDaoImpl.class);

	@Autowired
	private EmployeeDao employeeDAO;
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootJdbcCrudApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		//createEmployee();
		//getEmployeeById();
		//employeeDAO.updateEmployeeEmailById(19, "santhoshsshyaga86@gmail.com");
		//employeeDAO.deleteEmployeeById(1);	
		
	}
    @RequestMapping(value="/getEmployee")
	private void getEmployeeById() {
		Employee employee=employeeDAO.getEmployeeById(1);
		//logger.info(employee);
		System.out.println(employee);
	}
	
    @RequestMapping(value="/createEmployee")
	private void createEmployee() {
		Employee employee=new Employee();
		
		employee.setEmployeeName("Santhosh Reddy");
		employee.setSalry(20000.00);
		employee.setEmail("sshyaga86@gmail.com");
		
		employeeDAO.createEmployee(employee); 
	
	}
	@RequestMapping(value="/updateEmployee")
	private void updateEmployeeEmailById() {
		
		employeeDAO.updateEmployeeEmailById(19,"santhoshshyaga@gmail.com");
		
	}
	@RequestMapping(value="/deleteEmployee")
	private void deleteEmployeeById() {
		
		employeeDAO.deleteEmployeeById(15);
	}

}

