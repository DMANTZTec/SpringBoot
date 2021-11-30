package com.annotations.example.springboot.StudentController;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.annotations.example.springboot.StudentService.StudentService;
import com.annotations.example.springboot.model.Course;

@RestController
public class StudentController {
	
	@GetMapping("/s")
	public List<Course> retreiveCourse()
	{
		return List.of(new Course("1", "rajarani", "description",Arrays.asList("Learn Maven", "Import Project", "First Example",
				"Second Example")),new Course("1", "rajarani", "description",Arrays.asList("Learn Maven", "Import ", "First Example",
						"Second Example")));
	}
}
