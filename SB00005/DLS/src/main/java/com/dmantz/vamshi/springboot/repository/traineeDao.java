package com.dmantz.vamshi.springboot.repository;

import java.util.List;

import com.dmantz.vamshi.springboot.common.model.Course;
import com.dmantz.vamshi.springboot.common.model.MyCourse;
import com.dmantz.vamshi.springboot.common.model.Trainee;


public interface traineeDao {
	public List<Course> getAll();
	public MyCourse getById(int traineeId);

}
