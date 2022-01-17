package com.dmantz.vamshi.commom.service;

import java.util.List;

import com.dmantz.vamshi.commom.entity.Course;

public interface CourseService {
	public List<Course> findAll();
	public Course getById(int courseId);

}
