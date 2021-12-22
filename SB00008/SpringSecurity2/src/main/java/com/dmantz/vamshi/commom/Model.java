package com.dmantz.vamshi.commom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="security")
public class Model {
	@Id
	private Long id;
	private String userName;
	private String password;
	private String role;
	
	
	@Override
	public String toString() {
		return "Model [id=" + id + ", userName=" + userName + ", password=" + password + ", role=" + role + "]";
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
