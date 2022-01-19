package com.dmantz.vamshi.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.vamshi.common.entity.CourseDetail;
import com.dmantz.vamshi.common.repository.CourseRepository;
@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	CourseRepository courseRepository;

	@Override
	public List<CourseDetail> findAll() {
		// TODO Auto-generated method stub
		List<CourseDetail> courses=courseRepository.findAll();
		return courses;
	}

	@Override
	public CourseDetail getById(int courseId) {
		// TODO Auto-generated method stub
		CourseDetail course=courseRepository.getById(courseId);
		return course;
	}

}
