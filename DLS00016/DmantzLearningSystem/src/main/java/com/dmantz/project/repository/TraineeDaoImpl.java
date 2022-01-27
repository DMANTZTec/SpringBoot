package com.dmantz.project.repository;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.dmantz.project.model.MyTask;
import com.dmantz.project.model.TraineeTask;
import com.dmantz.project.service.TraineeTopicOutput;

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

	

}
