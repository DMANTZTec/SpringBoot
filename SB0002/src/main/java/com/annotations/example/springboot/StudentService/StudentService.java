package com.annotations.example.springboot.StudentService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.annotations.example.springboot.model.Course;
import com.annotations.example.springboot.model.Student;
@Component
public class StudentService {

		private static List<Student> st = new ArrayList<>();

		static {
			//Initialize Data
			Course course1 = new Course("Course1", "Spring", "10Steps", Arrays
					.asList("Learn Maven", "Import Project", "First Example",
							"Second Example"));
			Course course2 = new Course("Course2", "Spring MVC", "10 Examples",
					Arrays.asList("Learn Maven", "Import Project", "First Example",
							"Second Example"));

			Student Amulya = new Student("Student1", "Amulya Madupoju",
					"Hiker, Programmer and Architect", new ArrayList<>(Arrays
							.asList(course1, course2)));
		

		}
		
		
	
}
