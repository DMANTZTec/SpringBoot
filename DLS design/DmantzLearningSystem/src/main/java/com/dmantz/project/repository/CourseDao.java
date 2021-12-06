package com.dmantz.project.repository;

import java.util.List;

import com.dmantz.project.model.Course;

public interface CourseDao {
	
	
	
	//void viewCourse(String courseId);
	
	
	public abstract int addCourse(Course course);
	public abstract Course fetchCourseById(String courseId);
	public abstract List<Course> fetchAllCourses();
	public abstract void deleteCourseById(String courseId);
	

}
