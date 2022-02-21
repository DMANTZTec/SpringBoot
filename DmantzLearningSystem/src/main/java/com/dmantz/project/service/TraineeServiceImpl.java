package com.dmantz.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.project.model.Courses;
import com.dmantz.project.model.MyTask;
import com.dmantz.project.model.TraineeCourseDetail;
import com.dmantz.project.model.TraineeTask;
import com.dmantz.project.repository.TraineeDao;
import com.dmantz.project.response.TraineeTopicOutput;

@Service
public class TraineeServiceImpl implements TraineeService{

	@Autowired
	TraineeDao traineedao;
	
	
	@Override
	public TraineeTopicOutput saveNewTask(int toipcId,int traineeId) {
	   
		 return traineedao.saveNewTask( toipcId, traineeId);
		
	}


	@Override
	public List<MyTask> getMyOngoingTask(int traineeId) {
	
		return traineedao.getMyOngoingTask(traineeId);
	}


	@Override
	public String getMyCourses(int traineeId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<TraineeCourseDetail> getMyCourseDetail(int traineeId) {
	
		return traineedao.getMyCourseDetail(traineeId);
	}

}
