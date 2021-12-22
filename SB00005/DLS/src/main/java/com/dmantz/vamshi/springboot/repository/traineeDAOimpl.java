package com.dmantz.vamshi.springboot.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dmantz.vamshi.springboot.common.model.Course;
import com.dmantz.vamshi.springboot.common.model.MyCourse;

@Repository
public class traineeDAOimpl implements traineeDao {
	@Autowired
	JdbcTemplate jt;

	@Override
	public List<Course> getAll() {
		return jt.query("select*from course", new BeanPropertyRowMapper<Course>(Course.class));
	}

	@Override
	public MyCourse getById(int traineeId) {
		// TODO Auto-generated method stub
		return jt.queryForObject("select from my_course where trainee_id=?", new BeanPropertyRowMapper<MyCourse>(MyCourse.class),traineeId);
	}

}
