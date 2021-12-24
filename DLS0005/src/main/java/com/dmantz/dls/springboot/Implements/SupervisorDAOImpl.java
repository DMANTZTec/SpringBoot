package com.dmantz.dls.springboot.Implements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.dmantz.dls.springboot.Repository.SupervisorDAO;
import com.dmantz.dls.springboot.model.Course;
import com.dmantz.dls.springboot.model.Trainee;
//import com.dmantz.dls.springboot.model.WorkLog;
	
	@Repository
	public class SupervisorDAOImpl  implements SupervisorDAO {
		
			@Autowired
			JdbcTemplate jdbcTemplate;
			@Override
			public Course viewCourseProgress(int courseId) {
				return null;
			}
				
				@Override
				public Trainee viewDailyWorkLog(int TraineeId) {
					return jdbcTemplate.queryForObject("select*from worklog where trainee_id=?", new BeanPropertyRowMapper<Trainee>(),TraineeId);
				}			
			
}
