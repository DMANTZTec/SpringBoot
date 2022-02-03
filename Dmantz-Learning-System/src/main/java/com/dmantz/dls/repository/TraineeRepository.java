package com.dmantz.dls.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmantz.dls.entity.Trainee;
import com.dmantz.dls.entity.TraineeTask;


@Repository
public interface TraineeRepository extends JpaRepository<Trainee,Integer> {

//	public List<TraineeTask> findAll();
//	
//	
//	List<TraineeTask> findBytraineeId(int traineeId);
//	
//	TraineeTask findBytraineeId1(int traineeId);




}
