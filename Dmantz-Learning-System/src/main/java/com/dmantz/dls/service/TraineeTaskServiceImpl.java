package com.dmantz.dls.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.dls.entity.TraineeTask;
import com.dmantz.dls.repository.TraineeTaskRepository;


@Service
public class TraineeTaskServiceImpl implements TraineeTaskService {

	
	@Autowired 
	TraineeTaskRepository traineeTaskRepo;

	@Override
	public List<TraineeTask> getByTraineeId(int traineeId) {
		List<TraineeTask> ttt=traineeTaskRepo.getByTraineeId(traineeId);

		return ttt;
	}
	
	
	
//	@Override
//	public TraineeTask searchByName(String taskId) {
//		
//		return traineeTaskRepo.findBytaskIdContainsAllIgnoreCase(taskId);
//	}

}
