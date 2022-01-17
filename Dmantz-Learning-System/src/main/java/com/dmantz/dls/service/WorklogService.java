package com.dmantz.dls.service;

import java.util.List;

import com.dmantz.dls.entity.Worklog;

public interface WorklogService {
	
	public List<Worklog> findByTraineeId(int traineeId);

}
