package com.dmantz.vamshi.common.service;

import java.util.List;

import com.dmantz.vamshi.common.entity.CourseDetail;

public interface CourseService {
	public List<CourseDetail> findAll();
	public CourseDetail getById(int courseId);

}
