package com.dmantz.dls.service;

import java.util.List;

import com.dmantz.dls.entity.TraineeTask;

public interface TraineeTaskService {
	
	//public TraineeTask searchByName(String taskId);
	
	public List<TraineeTask> getByTraineeId(int traineeId);


}
