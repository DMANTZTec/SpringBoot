package com.dmantz.dls.repository;

import java.util.List;
import javax.persistence.EntityManager; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.dmantz.dls.entity.TraineeTask;
import com.dmantz.dls.request.NewTaskRequest;
import com.dmantz.dls.request.OngoingTaskRequest;
import com.dmantz.dls.response.NewTaskResponse;
import com.dmantz.dls.response.OngoingTaskResponse;
@EnableJpaRepositories
@Repository
public interface TraineeTaskRepository extends JpaRepository<TraineeTask,Integer> {
//	@Query(value="SELECT tt.trainee_task_id,tt.start_date,tt.end_date,t.topic_id,t.topic_name,m.module_id,m.module_name,c.course_id,c.course_name,ttl.log_date,ttl.no_of_hours\r\n"
//			+ "FROM trainee_task tt\r\n"
//			+ "JOIN topic t on t.topic_id=tt.topic_id \r\n"
//			+ " \r\n"
//			+ "JOIN  module m on m.module_id=t.module_id\r\n"
//			+ "\r\n"
//			+ "JOIN course c on c.course_id=m.course_id\r\n"
//			+ "JOIN trainee_task_log ttl on tt.trainee_task_id=ttl.trainee_task_id",nativeQuery=true)
	
//	List<OngoingTaskResponse> getByJoinInformation();
	
//	List<OngoingTaskResponse> getByTraineeId(int traineeId);

	//List<TraineeTask> findBytraineeId(int traineeId);
	
	@Query("SELECT new com.dmantz.dls.response.OngoingTaskResponse(tt.traineeTaskId,tt.startDate,tt.endDate,t.topicId,t.topicName,m.moduleId,m.moduleName,c.courseId,c.courseName,ttl.noOfHours) FROM Course c \r\n"
			+ "	JOIN c.modules m\r\n"
			+ "	JOIN m.topics t\r\n"
			+ "	JOIN t.traineeTasks tt\r\n"
			+ "JOIN tt.taskAddHours ttl\r\n"
			+ "WHERE tt.endDate IS NULL")
	
	List<OngoingTaskResponse> getByJoinInformation();
	
	
//	@Query(value="SELECT  tt.trainee_task_id,tt.start_date,t.topic_name,m.module_id,m.module_name,c.course_id  \r\n"
//			+ "FROM topic t \r\n"
//			+ "JOIN trainee_task tt on tt.topic_id=t.topic_id\r\n"
//			+ "JOIN module m on m.module_id=t.module_id\r\n"
//			+ "JOIN course c on c.course_id=m.course_id",nativeQuery=true)
//	List<OngoingTaskResponse> getByJoinInformation();
	

	
//	@Query("SELECT tt.traineeTaskId,tt.startDate,tt.endDate,t.topicId,t.topicName,m.moduleId,m.moduleName,c.courseId,c.courseName,ttl.logDate,ttl.noOfHours\r\n"
//			+ "FROM course c \r\n"
//			+ "JOIN c.modules m\r\n"
//			+ "JOIN m.topics t\r\n"
//			+ "JOIN t.traineeTasks tt\r\n"
//			+ "JOIN tt.taskAddHours ttl")
//	List<OngoingTaskResponse> getByJoinInformation();



	
	
	
	
 //public NewTaskResponse saveTraineeTask(int topicId, int traineeId);
	
	

	 

}
