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
@Table(name = "trainee_task_log")
public class TaskAddHours {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "log_id")

	private int logId;
	
	@Column(name = "lod_date")

	private Date logDate;

	@Column(name = "no_of_hours")

	private String noOfHours;
	
	//private int traineeTaskId;
	
	@Column(name = "entry_date_time")
	
	private String entryDatetime;
	
	
//	@ManyToOne(targetEntity = TraineeTask.class, fetch = FetchType.EAGER)
//	@JoinColumn(name = "trainee_task_id", insertable = false, updatable = false)
//	private TraineeTask traineeTask;

//	@ManyToOne(targetEntity = TraineeTask.class,cascade=CascadeType.ALL)
//	@JoinColumn(name="trainee_task_id",referencedColumnName="trainee_task_id")
//	private TraineeTask traineeTask;	
	
}
