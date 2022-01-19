package com.dmantz.vamshi.common.service;

import java.util.List;

import com.dmantz.vamshi.common.entity.TraineeCourses;

public interface MyCoursesService {
	public List<TraineeCourses> findByTraineeId(int traineeId);
	

}
