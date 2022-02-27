package com.dmantz.dls.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmantz.dls.entity.Course;


@Repository

public interface CourseRepository extends JpaRepository<Course,Integer> {



	List<Course> findAll();
	
	Course findByCourseId(int courseId);
	
}
