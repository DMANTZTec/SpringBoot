package com.dmantz.project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dmantz.project.model.Course;

@Repository
public abstract class CourseImplDao implements CourseDao {
    
	@Autowired
	JdbcTemplate jt;
	
	@Override
	public int addCourse(Course course) {
		String sql= "insert into course values(?,?,?,?)";
		return jt.update(sql,course.getCourseId(),course.getCourseName(),course.getRecommendedDuration(),course.getModules());
		
	}
	
}
