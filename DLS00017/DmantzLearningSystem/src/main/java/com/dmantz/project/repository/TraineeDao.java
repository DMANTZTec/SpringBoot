package com.dmantz.project.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dmantz.project.model.Course;
import com.dmantz.project.model.MyTask;
import com.dmantz.project.model.Trainee;
import com.dmantz.project.model.TraineeTask;
import com.dmantz.project.response.TraineeTopicOutput;


@Repository
public interface TraineeDao {
	
  //public List<TraineeTask> fetchAssignCourses();

      public TraineeTopicOutput saveNewTask(int toipcId,int traineeId);

	

     public List<MyTask> getMyOngoingTask(int traineeId);
     
     public String getMyCourses(int traineeId);
     
     public String getMyCourseDetail(int traineeId);

	
	
	
	

}
