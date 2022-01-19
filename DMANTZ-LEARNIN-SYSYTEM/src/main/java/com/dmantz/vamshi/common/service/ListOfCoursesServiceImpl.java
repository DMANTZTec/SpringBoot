package com.dmantz.vamshi.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.vamshi.common.entity.Course;
import com.dmantz.vamshi.common.entity.CourseDetail;
import com.dmantz.vamshi.common.repository.CourseDetailRepository;
@Service
public class ListOfCoursesServiceImpl implements ListOfCoursesService {
	@Autowired
	CourseDetailRepository listOfCoursesRepository;

	@Override
	public List<Course> findAll() {
		// TODO Auto-generated method stub
		List<Course> courseslist=listOfCoursesRepository.findAll();

		return courseslist;
	}

}
