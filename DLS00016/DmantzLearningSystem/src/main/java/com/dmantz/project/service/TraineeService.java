package com.dmantz.project.service;

import org.springframework.stereotype.Service;

import com.dmantz.project.model.MyTask;
import com.dmantz.project.model.TraineeTask;

@Service
public interface TraineeService {
	
	   public TraineeTopicOutput saveNewTask(int toipcId,int traineeId);
	
	   public MyTask getMyOngoingTask(int traineeId);

}
