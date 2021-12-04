package com.dmantz.project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dmantz.project.model.Trainee;

@Repository
public class TraineeDaoImpl implements TraineeDao {
	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int saveTrainee(Trainee trainee) {
		String sql="insert into trainee values(?,?,?)";
		return jt.update(sql,trainee.getTraineeId(),trainee.getTraineeName(),trainee.getTraineeAddress());
	}
	@Override
	public int updateTrainee(Trainee trainee) {
		String sql="update trainee set trainee_name=?,trainee_address=? where trainee_id=?";
		return jt.update(sql,trainee.getTraineeId(),trainee.getTraineeName(),trainee.getTraineeAddress());
	}
	@Override
	public int deleteTrainee(int traineeid) {
		String sql="delete from trainee where trainee_id=?";
		return jt.update(sql,traineeid);
	}
	@Override
	public int updateTraineeBy(Trainee trainee) {
	  String sql="update from trainee set trainee_id=?,trainee_address=? where trainee_name=?";
		return jt.update(sql,trainee.getTraineeId(),trainee.getTraineeAddress(),trainee.getTraineeId());
	}
	
	

}
