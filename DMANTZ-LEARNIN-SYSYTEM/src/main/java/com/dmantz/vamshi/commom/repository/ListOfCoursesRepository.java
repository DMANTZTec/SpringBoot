package com.dmantz.vamshi.commom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmantz.vamshi.commom.entity.Course;
import com.dmantz.vamshi.commom.entity.ListOfCourses;



public interface ListOfCoursesRepository extends JpaRepository<ListOfCourses,Integer>{
    List<ListOfCourses> findAll();


}
