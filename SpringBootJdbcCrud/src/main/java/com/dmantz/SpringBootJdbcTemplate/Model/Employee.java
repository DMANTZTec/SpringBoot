package com.dmantz.SpringBootJdbcTemplate.Model;


public class Employee {
	
	private Integer employeeId;
	private String employeeName;
	private String email;
	private Double salry;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalry() {
		return salry;
	}
	public void setSalry(Double salry) {
		this.salry = salry;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email + ", salry="
				+ salry + "]";
	}
	

}
