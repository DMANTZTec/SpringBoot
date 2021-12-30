package com.dmantz.vamshi.springboot.common.model;



import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Worklog {
	public int taskId;
   public int traineeId;
   public String taskName;
	public int courseId;
	public String courseName;
	public int moduleId;
	public String moduleName;
	public Date startDate;
	public int hourSpent;
	public int expectedHours;
	public String issues;
	

}
