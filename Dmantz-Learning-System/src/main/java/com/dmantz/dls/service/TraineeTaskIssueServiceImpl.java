package com.dmantz.dls.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.dls.entity.TraineeTaskIssue;
import com.dmantz.dls.repository.TraineeTaskIssueRepository;

@Service
public class TraineeTaskIssueServiceImpl implements TraineeTaskIssueService {

	@Autowired 
	TraineeTaskIssueRepository taskIssueRepo;
	
	
	@Override
	public TraineeTaskIssue saveTraineeTaskIssue(TraineeTaskIssue traineeTaskIssue) {
        taskIssueRepo.save(traineeTaskIssue);
		return traineeTaskIssue;
	}
	
	

}
