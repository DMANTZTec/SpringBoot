package com.dmantz.dls.springboot.Service;

import com.dmantz.dls.springboot.model.Trainee;

public interface SupervisorService {
	
	 void viewCourseProgress(int courseId);

	 Trainee viewDailyWorkLog(int TraineeId);

}
