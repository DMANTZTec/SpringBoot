package com.dmantz.dls.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.dls.entity.Course;
import com.dmantz.dls.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	CourseRepository courseRepo;

	@Override
	public List<Course> findAll() {
		List<Course> courses = courseRepo.findAll();

		return courses;
	}
	
	@Override
	public Course findByCourseId(int courseId) {
		Course courseDetails = courseRepo.findByCourseId(courseId);
	 //System.out.println("Course Details: " +  courseDetails.getCourseName());
		return courseDetails;
	}
	

}
