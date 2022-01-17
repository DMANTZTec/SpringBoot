package com.dmantz.dls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.dls.entity.TraineeTaskIssue;
import com.dmantz.dls.service.TraineeTaskIssueService;

@RestController
@RequestMapping("/issue")
public class TraineeTaskIssueController {
	
	@Autowired 
	TraineeTaskIssueService traineeTaskIssueService;
	
	@PostMapping("/save")
	public TraineeTaskIssue saveTraineeTaskIssue(@RequestBody TraineeTaskIssue traineeTaskIssue) {
		traineeTaskIssueService.saveTraineeTaskIssue(traineeTaskIssue);

		return traineeTaskIssue;

	}

}
