package com.dmantz.dls.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.dls.entity.TraineeTask;
import com.dmantz.dls.request.NewTaskRequest;
import com.dmantz.dls.request.OngoingTaskRequest;
import com.dmantz.dls.response.NewTaskResponse;
import com.dmantz.dls.response.OngoingTaskResponse;
//import com.dmantz.dls.service.TaskAddHoursService;
import com.dmantz.dls.service.TraineeService;
//import com.dmantz.dls.service.TraineeTaskService;
import com.dmantz.dls.service.TraineeTaskService;

@RestController
//@RequestMapping("/trainee")
public class TraineeController {
	
	@Autowired
	TraineeService traineeService;
	 
	@RequestMapping(value="/trainee/new/task",method=RequestMethod.POST,
			produces= {
					"application/xml",
					"application/json"
			},	
			consumes= {
					"application/xml",
					"application/json"
			})
			
			
	
	public NewTaskResponse saveTraineeTask(@RequestBody NewTaskRequest ntr) {
		return traineeService.saveTraineeTask(ntr.getTopicId(),ntr.getTraineeId());
		 
	}
	
//	@RequestMapping(value="/task/details/{traineeId}",method=RequestMethod.GET)
//    public List<TraineeTask> findByTraineeeId(@PathVariable int traineeId){ 
//	 List<TraineeTask> ongoingTask=traineeService.findByTraineeId(traineeId);
//    	return ongoingTask;
//    }

	@Autowired 
	TraineeTaskService traineetaskService;
	
	@RequestMapping(value="/trainee/task/details",method=RequestMethod.GET)
			
//			produces= {
//					"application/xml",
//					"application/json"
//			},	
//			consumes= {
//					"application/xml",
//					"application/json"
//			})
//	
  public List<OngoingTaskResponse> getByJoinInformation(){ 
	 List<OngoingTaskResponse> ongoingTask=traineetaskService.getByJoinInformation();
  	return ongoingTask;
  }
	
	
	
//    public List<OngoingTaskResponse> getByTraineeeId(@PathVariable int traineeId){ 
//	 List<OngoingTaskResponse> ongoingTask=traineetaskService.getByTraineeId(traineeId);
//    	return ongoingTask;
//    }

	
	


	
	
	 

	
	
}

	
	
	
	

