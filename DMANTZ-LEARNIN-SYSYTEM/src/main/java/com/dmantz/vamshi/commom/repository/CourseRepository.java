package com.dmantz.vamshi.commom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dmantz.vamshi.commom.entity.Course;



public interface CourseRepository extends JpaRepository<Course,Integer>
{
    List<Course> findAll();
    Course getById(int courseId);
}
