package com.dmantz.vamshi.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.vamshi.common.entity.Course;
import com.dmantz.vamshi.common.entity.CourseDetail;
import com.dmantz.vamshi.common.entity.Module;
import com.dmantz.vamshi.common.service.CourseService;
import com.dmantz.vamshi.common.service.ListOfCoursesService;
import com.dmantz.vamshi.common.service.ModuleService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	CourseService courseService;

	@GetMapping("/listofcoursedetail")
	public List<CourseDetail> getAllCourses() {
		List<CourseDetail> courses = courseService.findAll();
		return courses;

	}

	@RequestMapping(value = "coursedetail/{courseId}", method = RequestMethod.GET)
	public CourseDetail getById(@PathVariable int courseId) {
		CourseDetail course = courseService.getById(courseId);
		return course;

	}

	@Autowired
	ListOfCoursesService listOfCoursesService;

	@GetMapping("/listofcourses")
	public List<Course> findAll() {
		List<Course> courseslist = listOfCoursesService.findAll();
		return courseslist;
	}

	@Autowired
	ModuleService moduleService;

	@RequestMapping(value = "modules/{courseId}", method = RequestMethod.GET)
	public List<Module> findBycourseId(@PathVariable int courseId) {
		List<Module> modulelist = moduleService.findBycourseId(courseId);

		return modulelist;
	}

}
