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
@Table(name = "trainee_task_issue")
public class TraineeTaskIssue {
	
	@Id
	@Column(name = "task_issue_id")
	@Getter
	@Setter
	private int taskIssueId;
	
	
	@Column(name = "task_id")
	@Getter
	@Setter
	private String taskId;
	
	@Id
	@Column(name = "issue_add_dt")
	@Getter
	@Setter
	private Date issueAddDt;
	
	@Id
	@Column(name = "issue_text")
	@Getter
	@Setter
	private String issueText;
	
	@Id
	@Column(name = "issue_status")
	@Getter
	@Setter
	private String issueStatus;

}
