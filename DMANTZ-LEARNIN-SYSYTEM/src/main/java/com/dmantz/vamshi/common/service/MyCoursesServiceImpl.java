package com.dmantz.vamshi.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.vamshi.common.entity.TraineeCourses;
import com.dmantz.vamshi.common.repository.TraineeCoursesRepository;

@Service
public class MyCoursesServiceImpl implements MyCoursesService {
	@Autowired
	TraineeCoursesRepository myCoursesRepository;

	@Override
	public List<TraineeCourses> findByTraineeId(int traineeId) {
		// TODO Auto-generated method stub
		List<TraineeCourses> myCourseList=myCoursesRepository.findByTraineeId(traineeId);
		return myCourseList;
	}

	
	

	

}
