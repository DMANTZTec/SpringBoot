package com.dmantz.dls.springboot.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dmantz.dls.springboot.model.Course;
import com.dmantz.dls.springboot.model.Module;
import com.dmantz.dls.springboot.model.Trainee_Course;


@Repository
public class TraineeDAOImpl implements TraineeDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Course> viewAllCourses() {
		return jdbcTemplate.query("select*from course", new BeanPropertyRowMapper<Course>(Course.class));
	}
	
	@Override
	public Course findByCourseId(int id) {
		return jdbcTemplate.queryForObject("select*from course where course_id=?",new BeanPropertyRowMapper<Course>(Course.class), id);
	}
	
	@Override
	public List<Trainee_Course> viewMyCourses(String trainee_id) {
		return jdbcTemplate.query("SELECT * FROM trainee_course where trainee_id=?", new BeanPropertyRowMapper<Trainee_Course>(Trainee_Course.class),trainee_id);
	}
	
	@Override
	public List<Module> viewMyModules(String course_id) {
		return jdbcTemplate.query("select*from module Where course_id=?", new BeanPropertyRowMapper<Module>(Module.class),course_id);
	}
	
	@Override
	public List<Module> viewMyTasks(String module_id) {
		return jdbcTemplate.query("select*from topic Where module_id=?", new BeanPropertyRowMapper<Module>(Module.class),module_id);
	}
		@Override
		public int update(Course c,int id) {
			return jdbcTemplate.update("INSERT INTO course (course_id, course_name,created_by,created_date,course_provider,recommended_duration) VALUES (?,?,?,?,?,?)", 
					new Object[] {c.getCourse_id(), c.getCourse_name(), c.getCreated_by(),c.getCreated_by(),c.getCourse_id(),c.getRecommended_duration()});
		}
}
