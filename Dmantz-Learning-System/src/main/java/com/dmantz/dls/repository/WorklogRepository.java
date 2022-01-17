package com.dmantz.dls.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmantz.dls.entity.Worklog;

@Repository
public interface WorklogRepository extends JpaRepository<Worklog,Integer> {
	
	 List<Worklog> findByTraineeId(int traineeId);


}
