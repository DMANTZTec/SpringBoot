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
@Table(name = "worklog")
public class Worklog {
	@Id
	@Column(name = "worklog_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private int worklogId;
	
	@Column(name = "task_id")
	@Getter
	@Setter
	private String taskId;
	
	@Column(name = "trainee_id")
	@Getter
	@Setter
	private int traineeId;
	
	
	@Column(name = "topic_name")
	@Getter
	@Setter
	private String topicName;
	
	@Column(name = "course_id")
	@Getter
	@Setter
	private int courseId;
	
	@Column(name = "course_name")
	@Getter
	@Setter
	private String courseName;
	
	
	@Column(name = "module_name")
	@Getter
	@Setter
	private String moduleName;
	
	
	
	@Column(name = "start_date")
	@Getter
	@Setter
	private Date startDate;
	
	@Column(name = "end_date")
	@Getter
	@Setter
	private Date endDate;
	
	@Column(name = "hours_spent")
	@Getter
	@Setter
	private String hoursSpent;
	
	@Column(name = "exp_hours")
	@Getter
	@Setter
	private String expHours;
	
	@Column(name = "current_issue")
	@Getter
	@Setter
	private String currentIssue;
	
	

}
