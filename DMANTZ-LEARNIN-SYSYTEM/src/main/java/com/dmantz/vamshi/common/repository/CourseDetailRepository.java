package com.dmantz.vamshi.common.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmantz.vamshi.common.entity.Course;
import com.dmantz.vamshi.common.entity.CourseDetail;



public interface CourseDetailRepository extends JpaRepository<Course,Integer>{
    List<Course> findAll();


}
