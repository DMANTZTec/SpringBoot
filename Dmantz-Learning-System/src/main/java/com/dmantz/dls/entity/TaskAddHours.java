package com.dmantz.dls.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Column(name = "task_log_id")
	@Getter
	@Setter
	private int taskLogId;
	
	
	@Column(name = "task_id")
	@Getter
	@Setter
	private String taskId;
	
	@Column(name = "log_date")
	@Getter
	@Setter
	private Date logDate;
	
	@Column(name = "no_of_hours")
	@Getter
	@Setter
	private String noOfHours;
}
