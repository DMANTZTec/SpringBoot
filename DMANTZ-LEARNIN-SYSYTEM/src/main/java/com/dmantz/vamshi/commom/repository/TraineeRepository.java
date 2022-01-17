package com.dmantz.vamshi.commom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dmantz.vamshi.commom.entity.Trainee;

public interface TraineeRepository extends JpaRepository<Trainee,Integer> {

}
