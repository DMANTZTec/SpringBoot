package com.dmantz.dls.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmantz.dls.entity.Worklog;
import com.dmantz.dls.repository.WorklogRepository;

@Service
public class WorklogServiceImpl implements WorklogService{
	
	@Autowired
	WorklogRepository workRepo;
	

	@Override
	public List<Worklog> findByTraineeId(int traineeId) {
		List<Worklog> worklogDetails=workRepo.findByTraineeId(traineeId);
		System.out.println("Task Details");
		return worklogDetails;
	}

	

}
