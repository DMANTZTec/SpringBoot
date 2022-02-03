package com.dmantz.dls.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.dls.entity.TraineeTask;
import com.dmantz.dls.repository.TraineeTaskRepository;


@Service
public class TraineeServiceImpl implements TraineeService {

	
	@Autowired 
	TraineeTaskRepository traineetaskRepo;
	
	
	@Override
	public TraineeTask saveTraineeTask(TraineeTask traineeTask) {
		traineetaskRepo.save(traineeTask);
		return traineeTask;
	}
	
	@Override
	public List<TraineeTask> findByTraineeId(int traineeId) {
		List<TraineeTask> ongoingTask = traineetaskRepo.findBytraineeId(traineeId);
	 System.out.println("OngoingTask Details: ");
		return ongoingTask;
	}

	
	
//	@Override
//	public TraineeTask findByTraineeId1(int traineeId) {
//		TraineeTask ongoingTask = traineeRepo.findBytraineeId1(traineeId);
//	 System.out.println("OngoingTask Details: ");
//		return ongoingTask;
//	}

	

}
