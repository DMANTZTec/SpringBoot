package com.dmantz.dls.springboot.Repository;

//import java.util.List;

import com.dmantz.dls.springboot.model.Course;
import com.dmantz.dls.springboot.model.Trainee;

public interface SupervisorDAO {
	
	public Course viewCourseProgress(int courseId);

	public Trainee viewDailyWorkLog(int TraineeId);
	

	


}
