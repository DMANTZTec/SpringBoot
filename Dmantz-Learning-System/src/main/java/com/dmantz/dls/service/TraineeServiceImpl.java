package com.dmantz.dls.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.dls.entity.TraineeTask;
import com.dmantz.dls.repository.TraineeRepository;


@Service
public class TraineeServiceImpl implements TraineeService {

	
	@Autowired 
	TraineeRepository traineeRepo;
	
	
	@Override
	public TraineeTask saveTraineeTask(TraineeTask traineeTask) {
		traineeRepo.save(traineeTask);
		return traineeTask;
	}
	
	@Override
	public List<TraineeTask> findByTraineeId(int traineeId) {
		List<TraineeTask> ongoingTask = traineeRepo.findBytraineeId(traineeId);
	 System.out.println("OngoingTask Details: ");
		return ongoingTask;
	}

	

}
