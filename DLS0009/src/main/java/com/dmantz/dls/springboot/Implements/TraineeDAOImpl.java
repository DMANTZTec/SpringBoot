package com.dmantz.dls.springboot.Implements;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.dmantz.dls.springboot.Repository.TraineeDAO;
import com.dmantz.dls.springboot.model.Course;
import com.dmantz.dls.springboot.model.Module;
import com.dmantz.dls.springboot.model.Trainee_Course;
import com.dmantz.dls.springboot.model.Worklog;


@Repository
public class TraineeDAOImpl implements TraineeDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Course> viewAllCourses() {
		return jdbcTemplate.query("select * from course", new BeanPropertyRowMapper<Course>(Course.class));
	}
	
	@Override
	public Course findByCourseId(int id) {
		return jdbcTemplate.queryForObject("select * from course where course_id=?",new BeanPropertyRowMapper<Course>(Course.class), id);
	}
	
	@Override
	public List<Trainee_Course> viewMyCourses(int traineeId) {
		return jdbcTemplate.query("SELECT * FROM trainee_course where trainee_id=?", new BeanPropertyRowMapper<Trainee_Course>(Trainee_Course.class),traineeId);
	}
	
	@Override
	public List<Module> viewMyModules(int courseId) {
		return jdbcTemplate.query("select * from module Where course_id=?", new BeanPropertyRowMapper<Module>(Module.class),courseId);
	}
	
	@Override
	public List<Module> viewMyTasks(int moduleId) {
		return jdbcTemplate.query("select * from topic Where module_id=?", new BeanPropertyRowMapper<Module>(Module.class),moduleId);
	}
	
	//inserting
		@Override
		public int save( Course c) {

			return jdbcTemplate.update("INSERT INTO course ( course_id,course_name,created_by,created_dt,course_provider,recommended_duration) VALUES (?,?,?,?,?,?)", 
					
					new Object[] { c.getCourseId(),c.getCourseName(), c.getCreatedBy(),c.getCreatedDt(),c.getCourseProvider(),c.getRecommendedDuration()});
		}
		
		
		//enter into worklog
		@Override
		public int save( Worklog w) {

			return jdbcTemplate.update("INSERT INTO worklog ( task_id,trainee_id,task_name,course_id,module_name,course_name,start_date,end_date,hours_spent,exp_hours,current_iss) VALUES (?,?,?,?,?,?,?,?,?,?,?)",
					
					new Object[] { w.getTaskId(),w.getTraineeId(),w.getTaskName(),w.getCourseId(),w.getModuleName(),w.getCourseName(),w.getStartDate(),w.getEndDate(),w.getHoursSpent(),w.getExpHours(),w.getCurrentIssue()});
		}
		
		
		
		@Override
		public List<Course> getAll() {
			// TODO Auto-generated method stub
			return jdbcTemplate.query("select*from course", new BeanPropertyRowMapper<Course>(Course.class));
		}

		@Override
		public Trainee_Course getById(int traineeId) {
			// TODO Auto-generated method stub
			return jdbcTemplate.queryForObject("select*from my_course where traineeId=?",  new BeanPropertyRowMapper<Trainee_Course>(Trainee_Course.class));
		}

		@Override
		public Worklog viewWorklog(int traineeId) {
			// TODO Auto-generated method stub
			return jdbcTemplate.queryForObject("select*from worklog where traineeId=?",  new BeanPropertyRowMapper<Worklog>(Worklog.class));
		}
		

		@Override
		public List<Module> viewModules(int courseId) {
			// TODO Auto-generated method stub
			return jdbcTemplate.query("select*from module where moduleId=?",  new BeanPropertyRowMapper<Module>(Module.class));
		}
		

		/*@Override
		public int reportDailyProgress(Worklog w) {
			// TODO Auto-generated method stub
			return jdbcTemplate.update("insert into worklog(task_id,task_name,module_id,module_name,course_id,course_name,start_date,hours_spent,expected_hours,issues,trainee_id)values(?,?,?,?,?,?,?,?,?,?,?)",
			new Object[] {w.taskId,w.taskName,w.moduleId,w.moduleName,w.courseId,w.courseName,w.startDate,w.hourSpent,w.expectedHours,w.issues,w.traineeId});
		}*/

		@Override
		public int reportIssue(Worklog w, int taskId) {
			// TODO Auto-generated method stub
			 //String SQL = "update worklog set issues = ? where task_id = ?";
			System.out.println(w.taskId);
			 return jdbcTemplate.update("update worklog w set issues=? where task_id=?",
						new Object[] {w.currentIssue,taskId});
			 

		}

		@Override
		public int addHoursTask(Worklog w, int taskId) {
			 return jdbcTemplate.update("update worklog w set hours_spent=? where task_id=?",
						new Object[] {w.hoursSpent,taskId});
			
		}

		@Override
		public int reportDailyProgress(Worklog w) {
			// TODO Auto-generated method stub
			return 0;
		}


	
}

