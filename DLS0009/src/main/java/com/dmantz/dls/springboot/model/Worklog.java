package com.dmantz.dls.springboot.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Worklog {
	public String taskId;
	public int traineeId;
	public String taskName;
	public int courseId;
	public String moduleName;
	public String courseName;
	public Date startDate;
	public Date endDate;
	public String hoursSpent;
	public String expHours;
	public String currentIssue;

}
