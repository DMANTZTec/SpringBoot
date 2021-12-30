package com.dmantz.vamshi.springboot.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dmantz.vamshi.springboot.common.model.Course;
import com.dmantz.vamshi.springboot.common.model.MyCourse;
import com.dmantz.vamshi.springboot.common.model.Task;
import com.dmantz.vamshi.springboot.common.model.Worklog;

@Repository
public class TraineeDAOimpl implements TraineeDao {
	@Autowired
	JdbcTemplate jt;

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return jt.query("select*from course", new BeanPropertyRowMapper<Course>(Course.class));
	}

	@Override
	public MyCourse getById(int traineeId) {
		// TODO Auto-generated method stub
		return jt.queryForObject("select*from my_course where traineeId=?",  new BeanPropertyRowMapper<MyCourse>(MyCourse.class));
	}

	@Override
	public Worklog viewWorklog(int traineeId) {
		// TODO Auto-generated method stub
		return jt.queryForObject("select*from worklog where traineeId=?",  new BeanPropertyRowMapper<Worklog>(Worklog.class));
	}
	

	@Override
	public List<Module> viewModules(int courseId) {
		// TODO Auto-generated method stub
		return jt.query("select*from module where moduleId=?",  new BeanPropertyRowMapper<Module>(Module.class));
	}
	

	@Override
	public int reportDailyProgress(Worklog w) {
		// TODO Auto-generated method stub
		return jt.update("insert into worklog(task_id,task_name,module_id,module_name,course_id,course_name,start_date,hours_spent,expected_hours,issues,trainee_id)values(?,?,?,?,?,?,?,?,?,?,?)",
		new Object[] {w.taskId,w.taskName,w.moduleId,w.moduleName,w.courseId,w.courseName,w.startDate,w.hourSpent,w.expectedHours,w.issues,w.traineeId});
	}

	@Override
	public int reportIssue(Worklog w, int taskId) {
		// TODO Auto-generated method stub
		 //String SQL = "update worklog set issues = ? where task_id = ?";
		System.out.println(w.taskId);
		 return jt.update("update worklog w set issues=? where task_id=?",
					new Object[] {w.issues,taskId});
		 

	}

	@Override
	public int addHoursTask(Worklog w, int taskId) {
		 return jt.update("update worklog w set hours_spent=? where task_id=?",
					new Object[] {w.hourSpent,taskId});
		
	}

}
