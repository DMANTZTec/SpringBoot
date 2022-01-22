package com.dmantz.dls.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.dls.entity.TraineeTask;
//import com.dmantz.dls.service.TaskAddHoursService;
import com.dmantz.dls.service.TraineeService;
//import com.dmantz.dls.service.TraineeTaskService;

@RestController
@RequestMapping("/trainee")
public class TraineeController {
	
	@Autowired
	TraineeService traineeService;
	
	@PostMapping("new/task/save")
	public TraineeTask saveTraineeTask(@RequestBody TraineeTask traineeTask) {
		traineeService.saveTraineeTask(traineeTask);
		return traineeTask;

	}
	
	 @GetMapping("ongoing/task/details/{traineeId}")
	    public List<TraineeTask> findByTraineeeId(@PathVariable int traineeId){
		 List<TraineeTask> ongoingTask=traineeService.findByTraineeId(traineeId);
	    	return ongoingTask;
	    }
	
	
	
//	@Autowired 
//	TaskAddHoursService taskAddHoursService;
//	
//	@PostMapping("/task/add/hours/save")
//	public TaskAddHours saveTaskAddHours(@RequestBody TaskAddHours taskAddHours) {
//		taskAddHoursService.saveTaskAddHours(taskAddHours);
//		return taskAddHours;
//
//	}
}
	
	
	

	
	
//	@Autowired 
//	TraineeTaskIssueService traineeTaskIssueService;
	
//	@PostMapping("task/issue/save")
//	public TraineeTaskIssue saveTraineeTaskIssue(@RequestBody TraineeTaskIssue traineeTaskIssue) {
//		traineeTaskIssueService.saveTraineeTaskIssue(traineeTaskIssue);
//		return traineeTaskIssue;
//
//	}
//	
//	@GetMapping("/task/issues/{taskId}")
//    public TraineeTaskIssue search1(@PathVariable String taskId){
//		
//		return traineeTaskIssueService.searchByName(taskId);
//	}
//	
//	
//	@Autowired 
//	TraineeTaskService traineeTaskService;
//	
//	@GetMapping("/trainee_task/issues/{taskId}")
//    public TraineeTask search2(@PathVariable String taskId){
//		
//		return traineeTaskService.searchByName(taskId);
//	}
	
	
	
	
	
	//WORKLOG ENTRY
	
//	@Autowired
//	WorklogService worklogService;
//	
//	@GetMapping("task/details/{traineeId}")
//	 public List<Worklog> findByTraineeId(@PathVariable int traineeId){
//    	List<Worklog> worklogDetails=worklogService.findByTraineeId(traineeId);
//    	return worklogDetails;
//	}
//	
//	@GetMapping("task/search/{taskId}")
//	public List<Worklog> search(@PathVariable String taskId){
//		
//		return worklogService.searchByName(taskId);
//	}
//	
//	
//	@PostMapping("task/report/progress")
//	public Worklog saveWorklog(@RequestBody Worklog worklog) {
//		return worklogService.saveWorklog(worklog);
//	}
//	
//	
//	@DeleteMapping("task/delete/{worklogId}")
//	public String delete(@PathVariable int worklogId) {
//
//		Worklog worklog = worklogService.findByWorklogId(worklogId);
//		if (worklog == null) {
//			throw new RuntimeException("Order not found with id" + worklogId);
//		}
//
//		worklogService.deleteByWorklogId(worklogId);
//		return "Deleted order with id :" + worklogId;
//	}
//
//}
