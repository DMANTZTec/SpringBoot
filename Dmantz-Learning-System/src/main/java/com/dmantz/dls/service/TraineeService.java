package com.dmantz.dls.service;

import java.util.List;

import com.dmantz.dls.entity.TraineeTask;

public interface TraineeService {
	
	
	public TraineeTask saveTraineeTask(TraineeTask traineeTask);
	
	public List<TraineeTask> findByTraineeId(int traineeId);
	
	//public TraineeTask findByTraineeId1(int traineeId);

	
	


	
	

	
	
}
