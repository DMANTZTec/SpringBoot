package com.dmantz.dls.service;

import java.util.List;

import com.dmantz.dls.entity.TraineeTask;
import com.dmantz.dls.request.OngoingTaskRequest;
import com.dmantz.dls.response.OngoingTaskResponse;

public interface TraineeTaskService {
	
	//public TraineeTask searchByName(String taskId);
	
//	public List<TraineeTask> getByTraineeId(int traineeId);
	
	
//	public List<OngoingTaskResponse> getByTraineeId(int traineeId);

	public List<OngoingTaskResponse> getByJoinInformation();



}
