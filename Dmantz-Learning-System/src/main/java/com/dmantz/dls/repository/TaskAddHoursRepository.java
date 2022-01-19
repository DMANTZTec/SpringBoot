package com.dmantz.dls.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmantz.dls.entity.TaskAddHours;


@Repository
public interface TaskAddHoursRepository extends JpaRepository<TaskAddHours,Integer> {

}
