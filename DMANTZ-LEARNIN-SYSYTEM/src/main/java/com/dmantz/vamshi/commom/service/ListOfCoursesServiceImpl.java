package com.dmantz.vamshi.commom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.vamshi.commom.entity.Course;
import com.dmantz.vamshi.commom.entity.ListOfCourses;
import com.dmantz.vamshi.commom.repository.ListOfCoursesRepository;
@Service
public class ListOfCoursesServiceImpl implements ListOfCoursesService {
	@Autowired
	ListOfCoursesRepository listOfCoursesRepository;

	@Override
	public List<ListOfCourses> findAll() {
		// TODO Auto-generated method stub
		List<ListOfCourses> courseslist=listOfCoursesRepository.findAll();

		return courseslist;
	}

}
