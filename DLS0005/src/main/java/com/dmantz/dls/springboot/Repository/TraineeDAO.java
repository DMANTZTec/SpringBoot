package com.dmantz.dls.springboot.Repository;

import java.util.List;

import com.dmantz.dls.springboot.model.Course;
import com.dmantz.dls.springboot.model.Module;
import com.dmantz.dls.springboot.model.Trainee_Course;
import com.dmantz.dls.springboot.model.Worklog;

public interface TraineeDAO {
	
	public List<Course> viewAllCourses();

	public Course findByCourseId(int id);
	
	public List<Trainee_Course> viewMyCourses(int trainee_id);
	
	public List<Module> viewMyModules(int course_id);
		
	public List<Module> viewMyTasks(int module_id);
	
	//inserting
	public int save( Course c);
	
	//enter into worklog
	public int save(Worklog w);
	
	
}
