package com.dmantz.dls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.dls.entity.Course;
import com.dmantz.dls.service.CourseService;


@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	CourseService courseService;

	@GetMapping("/list")
	public List<Course> getAllCourses() {
		List<Course> courses = courseService.findAll();
		return courses;
	}
		
    @GetMapping("/details/{courseId}")
    public Course findByCourseId(@PathVariable int courseId){
    	Course courseDetails=courseService.findByCourseId(courseId);
    	return courseDetails;
    }

	}

