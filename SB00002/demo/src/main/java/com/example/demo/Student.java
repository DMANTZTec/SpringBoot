package com.example.demo;

public class Student {
private String Firstname;
private String lastname;

public Student(String firstname, String lastname) {
	super();
	Firstname = firstname;
	this.lastname = lastname;
}
public String getFirstname() {
	return Firstname;
}
public void setFirstname(String firstname) {
	Firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}

}
