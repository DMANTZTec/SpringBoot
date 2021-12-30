package com.dmantz.vamshi.springboot.repository;

import java.util.List;

import com.dmantz.vamshi.springboot.common.model.Course;
import com.dmantz.vamshi.springboot.common.model.MyCourse;
import com.dmantz.vamshi.springboot.common.model.Task;
import com.dmantz.vamshi.springboot.common.model.Worklog;


public interface TraineeDao {
	public List<Course> getAll();
	public MyCourse getById(int traineeId);
	public Worklog viewWorklog(int traineeId);
	public List<Module> viewModules(int courseId);
	public int reportDailyProgress(Worklog w);
	public int reportIssue(Worklog w,int taskId);
	public int addHoursTask(Worklog w,int taskId);
	
	

	

}
