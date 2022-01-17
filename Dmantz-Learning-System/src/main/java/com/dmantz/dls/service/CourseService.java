package com.dmantz.dls.service;

import java.util.List;

import com.dmantz.dls.entity.Course;


public interface CourseService {
	
	public List<Course> findAll();
	
	public Course findByCourseId(int courseId);



}
