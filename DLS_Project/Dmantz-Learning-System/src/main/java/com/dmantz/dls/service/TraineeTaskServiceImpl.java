package com.dmantz.dls.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.dls.entity.TraineeTask;
import com.dmantz.dls.repository.TraineeTaskRepository;
import com.dmantz.dls.request.OngoingTaskRequest;
import com.dmantz.dls.response.OngoingTaskResponse;


@Service
public class TraineeTaskServiceImpl implements TraineeTaskService {

	
	@Autowired 
	TraineeTaskRepository traineeTaskRepo;
	
	@Override
	public List<OngoingTaskResponse> getByJoinInformation() {
		List<OngoingTaskResponse> ongoingTask =traineeTaskRepo.getByJoinInformation();
		return ongoingTask;
	}
	
	
	
//	@Override
//	public List<OngoingTaskResponse> getByTraineeId(int traineeId) {
//		List<OngoingTaskResponse> ongoingTask =traineeTaskRepo.getByTraineeId(traineeId);
//		return ongoingTask;
//	}

	



	
	
	
//	@Override
//	public TraineeTask searchByName(String taskId) {
//		
//		return traineeTaskRepo.findBytaskIdContainsAllIgnoreCase(taskId);
//	}

}
