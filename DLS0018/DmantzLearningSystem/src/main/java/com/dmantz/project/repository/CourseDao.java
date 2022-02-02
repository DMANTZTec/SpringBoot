package com.dmantz.project.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dmantz.project.model.Course;
import com.dmantz.project.model.Courses;

public interface CourseDao {
	
	public  Course fetchCourseById(int courseId);
	public  List<Course> fetchAllCourses();
	public List<Courses> getCourseList(int courseId);
	
	

}
