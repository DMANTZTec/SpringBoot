package com.dmantz.vamshi.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dmantz.vamshi.common.entity.Trainee;

public interface TraineeRepository extends JpaRepository<Trainee,Integer> {

}
