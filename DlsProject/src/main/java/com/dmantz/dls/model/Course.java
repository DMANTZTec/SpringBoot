package com.dmantz.dls.model;

import java.sql.Date;
//import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	
	public int courseId;
	private String courseName;
	private String createdBy;
	private Date createdDt;
	private String recommendedDuration;
	private String courseProvider;
}