package com.dmantz.dls.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmantz.dls.entity.TraineeTaskIssue;


@Repository
public interface TraineeTaskIssueRepository extends JpaRepository<TraineeTaskIssue,Integer> {

}
