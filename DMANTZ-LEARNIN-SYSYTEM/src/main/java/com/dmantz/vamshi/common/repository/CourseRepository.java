package com.dmantz.vamshi.common.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dmantz.vamshi.common.entity.CourseDetail;



public interface CourseRepository extends JpaRepository<CourseDetail,Integer>
{
    List<CourseDetail> findAll();
    CourseDetail getById(int courseId);
}
