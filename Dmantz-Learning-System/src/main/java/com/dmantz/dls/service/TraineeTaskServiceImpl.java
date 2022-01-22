//package com.dmantz.dls.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.dmantz.dls.entity.TraineeTask;
//import com.dmantz.dls.repository.TraineeTaskRepository;
//
//
//@Service
//public class TraineeTaskServiceImpl implements TraineeTaskService {
//
//	
//	@Autowired 
//	TraineeTaskRepository traineeTaskRepo;
//	
//	
//	
//	@Override
//	public TraineeTask searchByName(String taskId) {
//		
//		return traineeTaskRepo.findBytaskIdContainsAllIgnoreCase(taskId);
//	}
//
//}
