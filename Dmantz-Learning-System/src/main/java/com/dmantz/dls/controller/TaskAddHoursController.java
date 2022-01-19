package com.dmantz.dls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.dls.entity.TaskAddHours;
import com.dmantz.dls.service.TaskAddHoursService;


@RestController
@RequestMapping("/task/add/hours")
public class TaskAddHoursController {
	
	@Autowired 
	TaskAddHoursService taskAddHoursService;
	
	@PostMapping("/save")
	public TaskAddHours saveTaskAddHours(@RequestBody TaskAddHours taskAddHours) {
		taskAddHoursService.saveTaskAddHours(taskAddHours);
		return taskAddHours;

	}

	
	
	
	

}
