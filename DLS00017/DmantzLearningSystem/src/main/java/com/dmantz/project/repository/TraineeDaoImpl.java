package com.dmantz.project.repository;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.dmantz.project.model.CourseModule;
import com.dmantz.project.model.Courses;
import com.dmantz.project.model.HourSpentDetails;
import com.dmantz.project.model.MyTask;
import com.dmantz.project.model.TraineeTask;
import com.dmantz.project.response.TraineeTopicOutput;

@Repository
public class TraineeDaoImpl implements TraineeDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	private NamedParameterJdbcTemplate namedparameterjdbctemplate;
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedparameterjdbctemplate;
	}

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedparameterjdbctemplate) {
		this.namedparameterjdbctemplate = namedparameterjdbctemplate;
	}

	@Override
	public TraineeTopicOutput saveNewTask(int topicId,int traineeId) {
		
		String SQL="INSERT INTO trainee_task(trainee_id,topic_id,start_date) VALUES(?,?,?)";
		
		System.out.println("sfjdkwhs");
	     KeyHolder keyHolder = new GeneratedKeyHolder();

	     jdbcTemplate.update(connection -> {
	         PreparedStatement ps = connection
	           .prepareStatement(SQL,Statement.RETURN_GENERATED_KEYS);
	           ps.setInt(1, traineeId);
	           ps.setInt(2, topicId);
	           ps.setDate(3,  new Date(System.currentTimeMillis()));
	           return ps;
	         }, keyHolder);
              
	     TraineeTopicOutput traineetopicoutput=new  TraineeTopicOutput();
	     
	     
	     traineetopicoutput.setTraineeTaskId( keyHolder.getKey().longValue());
	     traineetopicoutput.setStatus("Success");
	     System.out.println("jkgafkasdu"+traineetopicoutput.getTraineeTaskId());
	     return  traineetopicoutput;
	     }

	@Override
	public List<MyTask> getMyOngoingTask(int traineeId) {
		
		String SQL="SELECT tt.trainee_task_id,tt.start_date,tt.end_date,t.topic_id,t.topic_name,m.module_id,m.module_name,c.course_id,c.course_name,ttl.log_date,ttl.no_of_hours,ttl.log_id\r\n"
				+ "FROM trainee_task tt, topic t, module m,course c,trainee_task_log ttl\r\n"
				+ "WHERE t.topic_id=tt.topic_id\r\n"
				+ "AND m.module_id=t.module_id\r\n"
				+ "AND c.course_id=m.course_id\r\n"
				+ "AND ttl.trainee_task_id=tt.trainee_task_id\r\n"
				+ "AND tt.end_date is null";
		MapSqlParameterSource map = new  MapSqlParameterSource().addValue("trainee_id", traineeId);
		
		return namedparameterjdbctemplate.query(SQL,map,new ResultSetExtractor<List<MyTask> >() {
			
			public List<MyTask> extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				List<MyTask> list= new ArrayList<MyTask>();
				Map<Integer, MyTask> myTaskMap = new HashMap<Integer, MyTask>();
				Map<Integer,HourSpentDetails> hoursMap= new HashMap<Integer, HourSpentDetails>();
				while(rs.next()) {
					Integer traineeTaskId = rs.getInt("trainee_task_id");
					MyTask mytask = myTaskMap.get(traineeTaskId);
					if(mytask== null) {
						mytask = new MyTask();
						myTaskMap.put(traineeTaskId,mytask);
						list.add(mytask);
						mytask.setTraineeTaskId(traineeTaskId);
						mytask.setCourseId(rs.getInt("course_id"));
						mytask.setCourseName(rs.getString("course_name"));
						mytask.setModuleId(rs.getInt("module_id"));
						mytask.setModuleName(rs.getString("module_name"));
						mytask.setTopicId(rs.getInt("topic_id"));
						mytask.setTopicName(rs.getString("topic_name"));
						mytask.setStartDate(rs.getDate("start_date"));
						mytask.setEndDate(rs.getDate("end_date"));
						mytask.setLogDate(rs.getDate("log_date"));
						mytask.setNoOfHours(rs.getInt("no_of_hours"));
					
				}
					if(mytask.getHourspentdetails()==null) {
						 mytask.setHourspentdetails(new ArrayList<HourSpentDetails>());
					 }
					List<HourSpentDetails> hourspent=mytask.getHourspentdetails();
					Integer taskLogId =rs.getInt("log_id");
					HourSpentDetails hourspentdetails= hoursMap.get(taskLogId);
					if( hourspentdetails== null) {
						 hourspentdetails=new HourSpentDetails();
						 hoursMap.put(taskLogId, hourspentdetails);
						 
						 hourspentdetails.setDate(rs.getInt("log_date"));
						 hourspentdetails.setHoursSpent(rs.getInt("no_of_hours"));
						 hourspent.add(hourspentdetails);
					}
							
			}
			
				return list;
			
		}
		
	});

		
	}

	@Override
	public String getMyCourses(int traineeId) {
	
		return null;
	}

	@Override
	public String getMyCourseDetail(int traineeId) {
		String SQL= " ";
		return null;
	}	

	
	

}
