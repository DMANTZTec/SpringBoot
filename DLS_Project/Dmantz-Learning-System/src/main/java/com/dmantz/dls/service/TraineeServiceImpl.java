package com.dmantz.dls.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.dls.entity.TraineeTask;
import com.dmantz.dls.repository.TraineeTaskRepository;
import com.dmantz.dls.request.NewTaskRequest;
import com.dmantz.dls.response.NewTaskResponse;


@Service
public class TraineeServiceImpl implements TraineeService {

	
	@Autowired 
	TraineeTaskRepository traineetaskRepo;

//	@Override
//	public NewTaskResponse  saveTraineeTask(int topicId,int traineeId) {
//		
//		return traineetaskRepo.saveTraineeTask(topicId, traineeId);
//	}
//	
	
	
	
//	@Override
//	public List<TraineeTask> findByTraineeId(int traineeId) {
//		List<TraineeTask> ongoingTask = traineetaskRepo.findBytraineeId(traineeId);
//	 System.out.println("OngoingTask Details: ");
//		return ongoingTask;
//	}

	@Override
	public NewTaskResponse saveTraineeTask(int topicId, int traineeId) {
		// TODO Auto-generated method stub
		return null;
	}

@Override
public List<TraineeTask> findByTraineeId(int traineeId) {
	// TODO Auto-generated method stub
	return null;
}

	
	
//	@Override
//	public TraineeTask findByTraineeId1(int traineeId) {
//		TraineeTask ongoingTask = traineeRepo.findBytraineeId1(traineeId);
//	 System.out.println("OngoingTask Details: ");
//		return ongoingTask;
//	}

	

}
