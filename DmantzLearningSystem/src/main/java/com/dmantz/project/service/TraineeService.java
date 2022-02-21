package com.dmantz.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dmantz.project.model.Courses;
import com.dmantz.project.model.MyTask;
import com.dmantz.project.model.TraineeCourseDetail;
import com.dmantz.project.model.TraineeTask;
import com.dmantz.project.response.TraineeTopicOutput;

@Service
public interface TraineeService {
	
	   public TraineeTopicOutput saveNewTask(int toipcId,int traineeId);
	
	   public List<MyTask> getMyOngoingTask(int traineeId);
	   
	   public String getMyCourses(int traineeId);
	   
	   public List<TraineeCourseDetail> getMyCourseDetail(int traineeId);

}
