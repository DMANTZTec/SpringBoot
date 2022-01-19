package com.dmantz.vamshi.common.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmantz.vamshi.common.entity.TraineeCoursesDetail;

public interface TraineeCoursesDetailRepository extends JpaRepository<TraineeCoursesDetail,Integer>
{
	List<TraineeCoursesDetail> findByTraineeId(int traineeId);

}
