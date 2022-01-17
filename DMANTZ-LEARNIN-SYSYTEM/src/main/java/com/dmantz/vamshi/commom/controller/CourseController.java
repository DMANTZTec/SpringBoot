package com.dmantz.vamshi.commom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.vamshi.commom.entity.Course;
import com.dmantz.vamshi.commom.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	CourseService courseService;
	@GetMapping("/list")
	public List<Course> getAllCourses() {
		List<Course> courses = courseService.findAll();
		return courses;

	}
	  @RequestMapping(value="course/{courseId}",method=RequestMethod.GET)
	    public Course getById(@PathVariable int courseId)
	    {
		  Course course=courseService.getById(courseId);
		  return course;
	    	
	    }


}
