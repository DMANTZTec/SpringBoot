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
@Table(name = "trainee_task_issue")
public class TraineeTaskIssue {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "issue_id")
	@Getter
	@Setter
	private int issueId;
	
	
	@Column(name = "trainee_task_id")
	@Getter
	@Setter
	private String traineeTaskId;
	
	
	@Column(name = "issue_add_dt")
	@Getter
	@Setter
	private Date issueAddDt;
	
	@Column(name = "issue_text")
	@Getter
	@Setter
	private String issueText;
	
	
	@Column(name = "issue_status")
	@Getter
	@Setter
	private String issueStatus;
	
//	@ManyToOne(targetEntity = TraineeTask.class, fetch = FetchType.EAGER)
//	@JoinColumn(name = "trainee_task_id", insertable = false, updatable = false)
//	private TraineeTask traineeTask;
//	
	

}
