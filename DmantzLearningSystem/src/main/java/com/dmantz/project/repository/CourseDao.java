package com.dmantz.project.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dmantz.project.model.Course;

public interface CourseDao {
	
	public  Course fetchCourseById(int courseId);
	public  List<Course> fetchAllCourses();
	
	

}
