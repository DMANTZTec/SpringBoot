package com.dmantz.dls.request;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.Query;

import com.dmantz.dls.entity.Trainee;
import com.dmantz.dls.entity.TraineeTask;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="new_task_request")
@Data
@NoArgsConstructor
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name="first",procedureName="get_my_task")})

public class NewTaskRequest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int newTaskRequestId;
	
	private int traineeTaskId;
	
	private Date startDate;
	
	private Date endDate;
	
	private int topicId;
	
	private String topicName;
	
	private int moduleId;
	
	private String moduleName;
	 
	private int courseId;
	
	private String courseName;
	
	private Date logDate;
	
	private String noOfHours;
	
	
	
	
//	@Query(value="CALL get_my_task",nativeQuery=true)
//	public List<TraineeTask> findByTraineeId(int traineeId) {
//		return null;
//	}
//	
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="trainee_task", joinColumns=@JoinColumn(name="new_task_request_id"),inverseJoinColumns=@JoinColumn(name="trainee_task_id"))
	@JoinColumn(name="traineeTaskId", referencedColumnName="newTaskRequestId")
	List<TraineeTask> traineeTasks;
	
	
	public List<Trainee> getAll(){
		return null;
	}
	@Override
	public String toString() {
		return null;
	}
}
	
	
	

	
	
	
	
	
	
	


