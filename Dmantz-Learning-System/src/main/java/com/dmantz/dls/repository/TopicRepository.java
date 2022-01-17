package com.dmantz.dls.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmantz.dls.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic,Integer> {

}
