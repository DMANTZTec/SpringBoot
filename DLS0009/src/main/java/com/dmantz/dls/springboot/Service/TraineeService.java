package com.dmantz.dls.springboot.Service;

import java.util.List;

import com.dmantz.dls.springboot.model.Course;
import com.dmantz.dls.springboot.model.Module;
import com.dmantz.dls.springboot.model.Trainee_Course;

public interface TraineeService {
	
	 List<Course> viewAllCourses();

	 Course findByCourseId(int id);
	
	 List<Trainee_Course> viewMyCourses(int trainee_id);
	
	 List<Module> viewMyModules(int course_id);
		
	 List<Module> viewMyTasks(int module_id);

}
