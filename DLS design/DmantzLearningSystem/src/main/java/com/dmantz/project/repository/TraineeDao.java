package com.dmantz.project.repository;

import com.dmantz.project.model.Trainee;

public interface TraineeDao {
	
	int saveTrainee(Trainee trainee);
	int updateTrainee(Trainee trainee);
	int updateTraineeBy(Trainee trainee);
	int deleteTrainee(int traineeid);

}
