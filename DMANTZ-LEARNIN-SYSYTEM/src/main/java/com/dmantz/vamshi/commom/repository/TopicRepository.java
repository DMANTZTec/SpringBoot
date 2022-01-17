package com.dmantz.vamshi.commom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dmantz.vamshi.commom.entity.Course;
import com.dmantz.vamshi.commom.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic,Integer> 
{

}
