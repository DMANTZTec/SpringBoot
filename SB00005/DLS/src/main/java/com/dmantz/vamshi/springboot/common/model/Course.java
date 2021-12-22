package com.dmantz.vamshi.springboot.common.model;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class Course {

	private int courseId;
	private String courseName;
	private int expectedHours;
	private String description;
	private ArrayList<Module> modules;
	
	

}
