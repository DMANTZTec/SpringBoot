package com.dmantz.dls.repository;

import java.util.List;
import javax.persistence.EntityManager; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.dmantz.dls.entity.TraineeTask;

@Repository
public interface TraineeTaskRepository extends JpaRepository<TraineeTask,Integer> {
	@Query("SELECT tt.trainee_task_id,tt.start_date,tt.end_date,t.topic_id,t.topic_name,m.module_id,m.module_name,c.course_id,c.course_name,ttl.log_date,ttl.no_of_hours\r\n"
			+ "FROM trainee_task tt\r\n"
			+ "JOIN topic t on t.topic_id=tt.topic_id \r\n"
			+ " \r\n"
			+ "JOIN  module m on m.module_id=t.module_id\r\n"
			+ "\r\n"
			+ "JOIN course c on c.course_id=m.course_id\r\n"
			+ "JOIN trainee_task_log ttl on tt.trainee_task_id=ttl.trainee_task_id\r\n"
			+ "WHERE trainee_id=1\r\n"
			+ "AND\r\n"
			+ "tt.end_date is null")
	List<TraineeTask> getByTraineeId(int traineeId);

	 
//	@Autowired
//	private EntityManager em;
//	
//	//@SuppressWarnings("unchecked")
//	@SuppressWarnings("unchecked")
//	public static List<TraineeTask> getTraineeTaskInfo(){
//		return em.createNamedStoredProcedureQuery("first").getResultList();
//	}
//@Query()
	
	List<TraineeTask> findBytraineeId(int traineeId);
}
