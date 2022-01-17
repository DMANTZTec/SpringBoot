package com.dmantz.vamshi.commom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.vamshi.commom.entity.Course;
import com.dmantz.vamshi.commom.repository.CourseRepository;
@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	CourseRepository courseRepository;

	@Override
	public List<Course> findAll() {
		// TODO Auto-generated method stub
		List<Course> courses=courseRepository.findAll();
		return courses;
	}

	@Override
	public Course getById(int courseId) {
		// TODO Auto-generated method stub
		Course course=courseRepository.getById(courseId);
		return course;
	}

}
