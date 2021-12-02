package com.dmantz.springboot.firstapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	//Restapi returns javabean
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Ramesh","Kurukula");
		
	}
	
	//Restapi returns list
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Swapna","Koyagura"));
		students.add(new Student("Vamshi","Bhairoju"));
		students.add(new Student("Amulya","Madupoju"));
		students.add(new Student("Mamatha","Tekumatla"));
		students.add(new Student("Naresh","Chepuroju"));
		students.add(new Student("Giridhar","jhsfihfio"));
		return students;
		
	}
	
	//springboot restapi with @pathvariable annotation
	//http://localhost:8080/student/1
	@GetMapping("/student/{firstName}/{lastName}/")
	public Student studentPathVariable(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
		return new Student(firstName,lastName);
	}
	//build rest API to handle query parameters
	//http://localhost:8080/student?firstName=Ramesh&lastName=Kurukula
	
	public Student studentQueryParam(
			@RequestParam(name = "firstName") String firstName,
			@RequestParam(name = "lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	

}
