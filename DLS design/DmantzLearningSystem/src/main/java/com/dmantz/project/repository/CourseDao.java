package com.dmantz.project.repository;

import com.dmantz.project.model.Course;

public interface CourseDao {
	
	
	int addCourse(Course course);
	int updateCourse(Course course);
	int deleteCourse(int courseId);
	int viewCourse(int courseId);
	

}
