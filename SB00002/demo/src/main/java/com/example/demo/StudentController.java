package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {
	@GetMapping
	public Student getStudent()
	{
	   return new Student("vamshi","Bhairoju");
		
	}
	@GetMapping("s")
	public List<Student> getStudents()
	{
		List<Student> st=new ArrayList<>();
		st.add(new Student("kiran","bommagani"));
		st.add(new Student("ravi","katikam"));
		st.add(new Student("sathish","ithagoni"));
		st.add(new Student("aravindh","pittala"));
		st.add(new Student("raju","goud"));
		return st;
		
	}

}
