package com.dmantz.project.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dmantz.project.model.Course;

public class CourseRowMapper implements RowMapper<Course> {

	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		Course course= new Course(null, null, null, null, null);
		course.setCourseId(rs.getString("course_Id"));
		course.setCourseName(rs.getString("course_name"));
		course.setCreatedBy(rs.getString("createdby"));
		course.setRecommendedDuration(rs.getString("recommended_duration"));
		//course.setModules(rs.List<String>("modules"));
		return course;
	}
}

