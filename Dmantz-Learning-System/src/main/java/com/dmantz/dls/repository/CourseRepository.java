package com.dmantz.dls.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmantz.dls.entity.Course;


@Repository

public interface CourseRepository extends JpaRepository<Course,Integer> {

//	@Override
//	default List<Course> findAllById(Iterable<Integer> ids) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	default Course getById(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	//List<Course> findAll();
	
	Course findByCourseId(int courseId);
	
}
