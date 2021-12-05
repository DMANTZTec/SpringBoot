package com.dmantz.dls.springboot.model;

import java.sql.Date;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	
	public int course_id;
	private String course_name;
	private String created_by;
	private Date created_dt;
	private String recommended_duration;
	private String course_provider;
	private ArrayList<Module> modules;
	

	
}
