package com.dmantz.project.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.project.model.Courses;
import com.dmantz.project.model.MyTask;
import com.dmantz.project.model.TraineeCourseDetail;
import com.dmantz.project.request.TraineeTopicInput;
import com.dmantz.project.response.TraineeTopicOutput;
import com.dmantz.project.service.TraineeService;
@RestController

public class TraineeController {
	
	@Autowired
	TraineeService traineeservice;
	
	
	@RequestMapping(value="Trainee/newtask1", method=RequestMethod.POST,
			consumes = {
					"application/json",
					"application/xml"
			},
			produces = {
					"application/json",
					"application/xml"
	
	})
    public TraineeTopicOutput saveNewTask(@RequestBody TraineeTopicInput traineeTopicInput) {
		
		 return  traineeservice.saveNewTask( traineeTopicInput.getTopicId(),traineeTopicInput.getTraineeId());
		   
	}
	
	@RequestMapping(value="Trainee/mytask/{traineeId}", method=RequestMethod.GET,
			
			
		
			produces = {
					"application/json",
					"application/xml"
			})
	public List<MyTask> getMyOngoingTask( @PathVariable int traineeId) {
		
		return traineeservice.getMyOngoingTask(traineeId);
	}
	
	public String getMyCourseDetails() {
		
		return null;
	}
	@RequestMapping(value="Trainee/mycoursedetail/{traineeId}",method=RequestMethod.GET,
			produces = {
					"application/json",
					"application/xml"
			}	)
	 public List<TraineeCourseDetail> getMyCourseList(@PathVariable int traineeId) {
		
		return traineeservice.getMyCourseDetail(traineeId);
	}
	  
	
	
}	
	
	

