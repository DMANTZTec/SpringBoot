package com.dmantz.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dmantz.project.model.Course;

@Service
public interface CourseService {

	
	public  Course fetchCourseById(int courseId);
	public  List<Course> fetchAllCourses();
}
