package com.dmantz.project.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.dmantz.project.model.TraineeTask;
import com.dmantz.project.service.TraineeService;
import com.dmantz.project.service.TraineeTopicInput;
import com.dmantz.project.service.TraineeTopicOutput;
@RestController
@RequestMapping(value="/Trainee")

public class TraineeController {
	
	@Autowired
	TraineeService traineeservice;
	
	
	@PostMapping(value="/newtask1")
			/*consumes = 
					"application/json",
					"application/xml"
			},
			produces = {
					"application/json",
					"application/xml"
	
	})*/

	public TraineeTopicOutput saveNewTask(@RequestBody TraineeTopicInput traineeTopicInput) {
		
		 return  traineeservice.saveNewTask( traineeTopicInput.getTopicId(),traineeTopicInput.getTraineeId());
		   
	}
	  
	
	
}	
	
	

