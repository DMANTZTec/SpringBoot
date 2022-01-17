package com.dmantz.dls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.dls.entity.Worklog;
import com.dmantz.dls.service.WorklogService;

@RestController
@RequestMapping("/task")
public class WorklogController {
	
	@Autowired
	WorklogService worklogService;
	
	@GetMapping("/details/{traineeId}")
	 public List<Worklog> findByTraineeId(@PathVariable int traineeId){
    	List<Worklog> worklogDetails=worklogService.findByTraineeId(traineeId);
    	return worklogDetails;
    }
	
	

}
