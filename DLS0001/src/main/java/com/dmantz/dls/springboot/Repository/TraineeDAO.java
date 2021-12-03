package com.dmantz.dls.springboot.Repository;

import java.util.List;

import com.dmantz.dls.springboot.model.Course;


public interface TraineeDAO {
	
	public List<Course> viewAllCourses();

	public Course findById(int id);
}
