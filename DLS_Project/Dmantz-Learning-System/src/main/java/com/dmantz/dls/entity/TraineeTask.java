package com.dmantz.dls.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "trainee_task")
public class TraineeTask {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "trainee_task_id")
	private int traineeTaskId;
	
//	@Column(name = "trainee_id")
//	private int traineeId;
		
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")	
	private Date endDate;	
		
//	private Topic topics;
	
	@OneToMany(targetEntity = TaskAddHours.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="trainee_task_id",referencedColumnName = "trainee_task_id")
	private List<TaskAddHours> taskAddHours;
	
	
	@OneToMany(targetEntity = TraineeTaskIssue.class,cascade=CascadeType.ALL)
	@JoinColumn(name="trainee_task_id",referencedColumnName="trainee_task_id")
	private List<TraineeTaskIssue> traineeTaskIssues;
	
	
	
	
	
//	@OneToMany(targetEntity = Topic.class,cascade = CascadeType.ALL)
//	@JoinColumn(name ="trainee_task_id",referencedColumnName = "traineeTaskId")
//	private List<Topic> topics;
	
	


	
//	@ManyToOne(targetEntity = Topic.class, fetch = FetchType.EAGER)
//	@JoinColumn(name = "topic_id", insertable = false, updatable = false)
//	private Topic topics;
	
	
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name = "topicId",referencedColumnName="topicId")
//	private Topic topics;
	
//	@Getter 
//	@Setter
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="traineeTaskId",referencedColumnName="traineeTaskId")
//	private List<TaskAddHours> taskAddHours;
//	

	

	
	
	
	
}

