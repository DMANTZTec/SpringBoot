package com.dmantz.project.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dmantz.project.model.Course;

@Repository
public abstract class CourseImplDao implements CourseDao {
    
	@Autowired
	private JdbcTemplate jt;
	public JdbcTemplate getJdbcTemplate() {
		return jt;
	}
	public void setJdbcTemplate(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	@Override
	public int addCourse(Course course) {
		String sql= "insert into course values(?,?,?,?)";
		return jt.update(sql,course.getCourseId(),course.getCourseName(),course.getCreatedBy(),course.getRecommendedDuration());
	
	}
	public Course fetchCourseById(String courseId) {
	String sql="select *from course where course_id=?";
	return getJdbcTemplate().queryForObject(sql, 	new CourseRowMapper(),courseId);
		
	}
	@Override
	public List<Course> fetchAllCourses(){
		String sql="SELECT * FROM course";
		return getJdbcTemplate().query(sql, new CourseRowMapper());
	}
	
		@Override
	public void deleteCourseById(String courseId) {
		String SQL = "DELETE FROM employee_table WHERE employee_id = ?";
		int update = getJdbcTemplate().update(SQL,courseId);
		if(update == 1) {
			System.out.println("Employee is deleted with ID = "+courseId);
		}
	}
	
}
