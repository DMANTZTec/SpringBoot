package com.dmantz.springbootjdbcdemo.entity;


import java.util.Date;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
/*import lombok.Data;
import lombok.Getter;

import lombok.Setter;

@Setter
@Getter 

@Data*/
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	private int id;
	
	private String name;
	
	private String location;
	
	private Date dateOfBirth;
	
	public Employee(String name, String location, Date dateOfBirth) {
		this.setName(name);
		this.setLocation(location);
		this.setDateOfBirth(dateOfBirth);
	}
	
	public Employee() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
