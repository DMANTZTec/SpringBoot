package com.dmantz.dls.repository;

import java.util.List;

import com.dmantz.dls.model.Course;
import com.dmantz.dls.model.Module;
import com.dmantz.dls.model.Trainee_Course;
import com.dmantz.dls.model.Worklog;

public interface TraineeDao {
	
	public List<Course> viewAllCourses();

	public Course findByCourseId(int id);
	
	public List<Trainee_Course> viewMyCourses(int trainee_id);
	
	public List<Module> viewMyModules(int course_id);
		
	public List<Module> viewMyTasks(int module_id);
	
	//inserting
	public int save( Course c);
	
	//enter into worklog
	public int save(Worklog w);

	public List<Course> getAll();

	public Trainee_Course getById(int traineeId);

	public Worklog viewWorklog(int traineeId);

	public List<Module> viewModules(int courseId);

	public int reportDailyProgress(Worklog w);

	public int reportIssue(Worklog w, int taskId);

	public int addHoursTask(Worklog w, int taskId);
	
	
	
	
	
}
