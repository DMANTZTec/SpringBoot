package com.dmantz.dls.service;

import java.util.List;

import com.dmantz.dls.entity.TraineeTask;
import com.dmantz.dls.request.NewTaskRequest;
import com.dmantz.dls.response.NewTaskResponse;

public interface TraineeService {
	
	
	public NewTaskResponse saveTraineeTask(int topicId,int traineeId);

	public List<TraineeTask> findByTraineeId(int traineeId);
	
	//public List<TraineeTask> findByTraineeId(int traineeId);
	
	//public TraineeTask findByTraineeId1(int traineeId);

	
	


	
	

	
	
}
