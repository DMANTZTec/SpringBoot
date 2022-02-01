package com.dmantz.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.project.model.Course;
import com.dmantz.project.model.Courses;
import com.dmantz.project.repository.CourseDao;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseDao coursedao;

	@Override
	public Course fetchCourseById(int courseId) {
		
		Course course=coursedao.fetchCourseById(courseId);
		return course;
		
	}

	@Override
	public List<Course> fetchAllCourses() {
		List<Course> courselist=coursedao.fetchAllCourses();
		return courselist;
	}

	@Override
	public List<Courses> getCourseList(int courseId) {
		List<Courses> courselist=coursedao.getCourseList(courseId);
		return courselist;
	}
	
	
	 
}
