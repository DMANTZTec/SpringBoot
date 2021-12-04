package com.dmantz.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dmantz.project.model.Course;
import com.dmantz.project.service.TraineeService;

public class TraineeController {
	
	@Autowired
	private TraineeService traineeService;
	
	@GetMapping("/trainee/{traineeId}/courses")
	public List<Course> retrieveCoursesForStudent(@PathVariable String traineeId) {
		return traineeService.retrieveCourses(traineeId);
	}
	
	@GetMapping("/trainee/{traineeId}/courses/{index}")
	public Course retrieveDetailsForCourse(@PathVariable String traineeId,
			@PathVariable String courseId) {
		return traineeService.retrieveCourse(traineeId, courseId);
	}

}
