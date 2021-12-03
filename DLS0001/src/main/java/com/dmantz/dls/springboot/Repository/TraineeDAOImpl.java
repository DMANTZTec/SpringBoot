package com.dmantz.dls.springboot.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dmantz.dls.springboot.model.Course;

@Repository
public class TraineeDAOImpl implements TraineeDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Course> viewAllCourses() {
		return jdbcTemplate.query("select*from course", new BeanPropertyRowMapper<Course>(Course.class));
	}
	@Override
	public Course findById(int id) {
		return jdbcTemplate.queryForObject("select*from course where course_id=?",new BeanPropertyRowMapper<Course>(Course.class), id);
	}
}
