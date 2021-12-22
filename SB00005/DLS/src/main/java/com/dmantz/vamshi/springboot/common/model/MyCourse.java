package com.dmantz.vamshi.springboot.common.model;



import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MyCourse {
	private int myCourseId;
	private int courseId;
	private String courseName;
	private Date startDate;
	private Date endDate;
	private String status;
	private int traineeId;
	private int hoursSpent;
	

}
