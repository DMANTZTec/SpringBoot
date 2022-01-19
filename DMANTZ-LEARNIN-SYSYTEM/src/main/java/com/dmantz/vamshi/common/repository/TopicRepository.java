package com.dmantz.vamshi.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dmantz.vamshi.common.entity.CourseDetail;
import com.dmantz.vamshi.common.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic,Integer> 
{

}
