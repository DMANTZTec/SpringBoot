package com.dmantz.dls.springboot.Repository;

import java.util.List;

import com.dmantz.dls.springboot.model.Course;
import com.dmantz.dls.springboot.model.Module;
import com.dmantz.dls.springboot.model.Trainee_Course;

public interface TraineeDAO {
	
	public List<Course> viewAllCourses();

	public Course findByCourseId(int id);
	
	public List<Trainee_Course> viewMyCourses(String trainee_id);
	
	public List<Module> viewMyModules(String course_id);
		
	public List<Module> viewMyTasks(String module_id);
	
	//inserting
	public int update(Course c,int id);
	
	
}
