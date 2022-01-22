package com.dmantz.project.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dmantz.project.model.Course;

@Repository
public  class CourseImplDao implements CourseDao {
	
	@Autowired
	private NamedParameterJdbcTemplate namedparameterjdbcTemplate;
    
	@Autowired
	public  CourseImplDao(NamedParameterJdbcTemplate namedparameterjdbcTemplate) {
		this.namedparameterjdbcTemplate = namedparameterjdbcTemplate;
	}
	
	@Override
	public Course fetchCourseById(int CourseId) {
		
		return this.namedparameterjdbcTemplate.queryForObject("SELECT * FROM WHERE course_id= :id", new MapSqlParameterSource("course_id",CourseId), new CourseMapper()); 
		
	}
	
	@Override
	public List<Course> fetchAllCourses() {
		 return this.namedparameterjdbcTemplate.query("SELECT * FROM Course", new CourseMapper());
	}
	
	 private static final class CourseMapper implements RowMapper<Course> {
		 
		 public Course mapRow(ResultSet rs,int rowNum)  throws SQLException{
			 
			 Course course = new Course();
			 course.setCourseId(rs.getInt("course_id"));
			 course.setCourseName(rs.getString("course_name"));
			 course.setCreatedBy(rs.getString("created_by"));
			 course.setCreatedDate(rs.getString("created_dt"));
			 course.setCourseProvider(rs.getString("course_provider"));
			 course.setRecommendedDuration(rs.getString("recommended_duration"));
	
		 return course;
	 }
	 }
}
	 
	 
	
	
	
	

		 
