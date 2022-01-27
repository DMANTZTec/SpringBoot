package com.dmantz.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.project.model.MyTask;
import com.dmantz.project.model.TraineeTask;
import com.dmantz.project.repository.TraineeDao;

@Service
public class TraineeServiceImpl implements TraineeService{

	@Autowired
	TraineeDao traineedao;
	
	
	@Override
	public TraineeTopicOutput saveNewTask(int toipcId,int traineeId) {
	   
		 return traineedao.saveNewTask( toipcId, traineeId);
		
	}


	@Override
	public MyTask getMyOngoingTask(int traineeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
