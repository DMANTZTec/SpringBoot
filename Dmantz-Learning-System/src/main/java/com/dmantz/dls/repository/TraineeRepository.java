package com.dmantz.dls.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmantz.dls.entity.Course;
import com.dmantz.dls.entity.Trainee;

public interface TraineeRepository extends JpaRepository<Trainee,Integer> {

	

}
