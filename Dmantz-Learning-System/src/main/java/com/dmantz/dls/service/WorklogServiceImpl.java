package com.dmantz.dls.service;

import java.util.List;
import java.util.Optional;

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


	@Override
	public Worklog saveWorklog(Worklog worklog) {
		return workRepo.save(worklog);
	}
	
	@Override
	public void deleteByWorklogId(int worklogId) {
		workRepo.deleteById(worklogId);

	}


	@Override
	public Worklog findByWorklogId(int worklogId) {
		Optional<Worklog> result = workRepo.findById(worklogId);
		Worklog worklog = null;

		if (result.isPresent()) {
			worklog = result.get();
		} else {
			throw new RuntimeException("Could not find by Id:" + worklogId);
		}
		return worklog;
	
		

	}
	

}
