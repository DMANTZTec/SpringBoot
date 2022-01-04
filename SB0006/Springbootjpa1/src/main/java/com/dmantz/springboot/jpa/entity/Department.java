package com.dmantz.springboot.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.Length;

@Entity
@XmlRootElement
public class Department {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long deparmentId;
	@javax.validation.constraints.NotBlank(	message="Please Add Department Name")
	/*@Length(max = 5,min=1)
	@Size(max=10, min=0)
	@Email
	@Positive
	@Negative
	@PositiveOrZero
	@NegativeOrZero
	@Future
	@FutureOrPresent
	@Past
	@PastOrPresent*/
	
	
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
