package com.dmantz.vamshi.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.vamshi.common.entity.TraineeCoursesDetail;
import com.dmantz.vamshi.common.repository.TraineeCoursesDetailRepository;


@Service
public class MyCoursesDetailServiceImpl implements MyCoursesDetailService{
	@Autowired
	TraineeCoursesDetailRepository myCourseDetailRepository;

	@Override
	public List<TraineeCoursesDetail> findByTraineeId(int traineeId) {
		// TODO Auto-generated method stub
		List<TraineeCoursesDetail> myCourseDetaillist=myCourseDetailRepository.findByTraineeId(traineeId);
		
		return myCourseDetaillist;
	}

}
