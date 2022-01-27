package com.dmantz.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.project.model.Course;
import com.dmantz.project.model.Courses;
import com.dmantz.project.repository.CourseDao;
import com.dmantz.project.service.CourseService;


@RestController
public class CourseController {
	
	@Autowired
	CourseService courseservice;

	@GetMapping("/courses")
	public List<Course> getCourses() {
	
		return courseservice.fetchAllCourses();
		
	}
	@GetMapping("/coursedetail/{courseId}")
	public List<Courses> getCourseDetail(@PathVariable int courseId) {
		return courseservice.getCourseList(courseId);
	}
}
