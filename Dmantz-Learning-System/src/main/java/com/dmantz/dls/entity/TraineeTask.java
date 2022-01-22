package com.dmantz.dls.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "trainee_task")
public class TraineeTask {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "trainee_task_id")
	@Getter
	@Setter
	private int traineeTaskId;
	
	
	@Column(name = "trainee_id")
	@Getter
	@Setter
	private int traineeId;
	
	@Column(name = "topic_id")
	@Getter
	@Setter
	private int topicId;
	
	@Column(name = "start_date")
	@Getter
	@Setter
	private Date startDate;
	
	@Column(name = "end_date")
	@Getter
	@Setter
	private Date endDate;
	
	
//	@Getter 
//	@Setter
//	@OneToMany(mappedBy = "trainee_task")
//	private List<TaskAddHours> taskAddHours;
//	
//	@Getter 
//	@Setter
//	@OneToMany(mappedBy = "trainee_task")
//	private List<TraineeTaskIssue> traineeTaskIssues;
	
	
	@Getter 
	@Setter
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="trainee_task_id",referencedColumnName="trainee_task_id")
	private List<TaskAddHours> taskAddHours;
	
	@Getter 
	@Setter
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="trainee_task_id",referencedColumnName="trainee_task_id")
	private List<TraineeTaskIssue> traineeTaskIssues;
	
	
}

