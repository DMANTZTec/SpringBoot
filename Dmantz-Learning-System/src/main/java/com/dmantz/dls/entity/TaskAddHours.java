package com.dmantz.dls.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "trainee_task_log")
public class TaskAddHours {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "log_id")
	@Getter
	@Setter
	private int logId;
	
	
	@Column(name = "log_date")
	@Getter
	@Setter
	private Date logDate;
	
	
	@Column(name = "no_of_hours")
	@Getter
	@Setter
	private String noOfHours;
	
	
	@Column(name = "trainee_task_id")
	@Getter
	@Setter
	private int traineeTaskId;
	
	
	@Column(name = "entry_datetime")
	@Getter
	@Setter
	private String entryDatetime;
	
//	
	@ManyToOne(targetEntity = TraineeTask.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "trainee_task_id", insertable = false, updatable = false)
	private TraineeTask traineeTask;
	
	
	
	
}
