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
//import com.dmantz.dls.service.TaskAddHoursService;
import com.dmantz.dls.service.TraineeService;
//import com.dmantz.dls.service.TraineeTaskService;
import com.dmantz.dls.service.TraineeTaskService;

@RestController
//@RequestMapping("/trainee")
public class TraineeController {
	
	@Autowired
	TraineeService traineeService;
	
	@RequestMapping(value="/trainee/new/task",method=RequestMethod.POST)
	public TraineeTask saveTraineeTask(@RequestBody TraineeTask traineeTask) {
		traineeService.saveTraineeTask(traineeTask);
		return traineeTask;
	}
	
//	@RequestMapping(value="/trainee/task/details/{traineeId}",method=RequestMethod.GET)
//    public List<TraineeTask> findByTraineeeId(@PathVariable int traineeId){ 
//	 List<TraineeTask> ongoingTask=traineeService.findByTraineeId(traineeId);
//    	return ongoingTask;
//    }

	@Autowired
	TraineeTaskService traineetaskService;
	
	@RequestMapping(value="/trainee/task/details/{traineeId}",method=RequestMethod.GET)
    public List<TraineeTask> getByTraineeeId(@PathVariable int traineeId){ 
	 List<TraineeTask> ongoingTask=traineetaskService.getByTraineeId(traineeId);
    	return ongoingTask;
    }
	
	
	
//	@PostMapping("new/task")
//	public TraineeTask saveTraineeTask(@RequestBody TraineeTask traineeTask) {
//		traineeService.saveTraineeTask(traineeTask);
//		return traineeTask;
//
//	}
//	
//	 @GetMapping("/task/details/{traineeId}")
//	    public List<TraineeTask> findByTraineeeId(@PathVariable int traineeId){ 
//		 List<TraineeTask> ongoingTask=traineeService.findByTraineeId(traineeId);
//	    	return ongoingTask;
//	    }
	
	
	 
//	 @GetMapping("/on/task/details/{traineeId}")
//	    public TraineeTask findByTraineeeId1(@PathVariable int traineeId){
//		 TraineeTask ongoingTask=traineeService.findByTraineeId1(traineeId);
//	    	return ongoingTask;
//	    }
	
	
}

	
	
	
	

