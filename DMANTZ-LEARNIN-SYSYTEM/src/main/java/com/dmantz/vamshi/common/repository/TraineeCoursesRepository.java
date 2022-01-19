package com.dmantz.vamshi.common.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmantz.vamshi.common.entity.TraineeCourses;

public interface TraineeCoursesRepository extends JpaRepository<TraineeCourses,Integer>{

      List<TraineeCourses> findByTraineeId(int traineeId);
      

}
