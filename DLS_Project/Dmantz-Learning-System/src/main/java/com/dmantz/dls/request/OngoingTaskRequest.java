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
    import javax.persistence.OneToOne;
    import javax.persistence.Table;

	import org.springframework.data.jpa.repository.Query;

import com.dmantz.dls.entity.Course;
import com.dmantz.dls.entity.TaskAddHours;//import com.dmantz.ecapp.request.ProductSkuRO;
import com.dmantz.dls.entity.Topic;
import com.dmantz.dls.entity.Trainee;
	import com.dmantz.dls.entity.TraineeTask;
    import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
	import lombok.NoArgsConstructor;
    import lombok.ToString;

	
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@ToString
	public class OngoingTaskRequest {
		
		private TraineeTask traineeTask;
		
//		private Topic topics;
//		
//		private Module modules;
//		
//		private Course courses;
//		
//		private TaskAddHours taskAddHours;
		
		
		
		
//		@Id
//		@GeneratedValue(strategy=GenerationType.AUTO)
//		
//		private int traineeTaskId;
//		
//		private Date startDate;
//		
//		private Date endDate;
//		
//		private int topicId;
//		
//		private String topicName;
//		
//		private int moduleId;
//		
//		private String moduleName;
//		 
//		private int courseId;
//		
//		private String courseName;
//		
//		private Date logDate;
//		
//		private String noOfHours;
		
//		@OneToMany(cascade = CascadeType.ALL)
//		@JoinColumn(name = "productId", referencedColumnName = "productId")
//		@JsonIgnore
//		List<ProductSkuRO> SKU;
		
		
//		@OneToMany(cascade=CascadeType.ALL)
//		@JoinTable(name="course", joinColumns=@JoinColumn(name="trainee_task_id"),inverseJoinColumns=@JoinColumn(name="course_id"))
//		@JoinColumn(name="courseId", referencedColumnName="traineeTaskId")
//		List<TraineeTask> traineeTasks;
		
//		@OneToMany(cascade=CascadeType.ALL)
//		@JoinTable(name="trainee_task_log", joinColumns=@JoinColumn(name="trainee_task_id"),inverseJoinColumns=@JoinColumn(name="log_id"))
//		@JoinColumn(name="logId", referencedColumnName="traineeTaskId")
//		List<TaskAddHours> taskAddHours;
//		
	}


