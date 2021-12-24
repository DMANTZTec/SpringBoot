package com.dmantz.springboot.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long deparmentId;
	private String departmentNmae;
	private String departmentAddress;
	private String departmentCode;
	
	public Department(Long deparmentId, String departmentNmae, String departmentAddress, String departmentCode) {
		super();
		this.deparmentId = deparmentId;
		this.departmentNmae = departmentNmae;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}
	
	public Department() {
		
		
	}
	
	public Long getDeparmentId() {
		return deparmentId;
	}
	public void setDeparmentId(Long deparmentId) {
		this.deparmentId = deparmentId;
	}
	public String getDepartmentNmae() {
		return departmentNmae;
	}
	public void setDepartmentNmae(String departmentNmae) {
		this.departmentNmae = departmentNmae;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	@Override
	public String toString() {
		return "Department [deparmentId=" + deparmentId + ", departmentNmae=" + departmentNmae + ", departmentAddress="
				+ departmentAddress + ", departmentCode=" + departmentCode + "]";
	}
	
}
