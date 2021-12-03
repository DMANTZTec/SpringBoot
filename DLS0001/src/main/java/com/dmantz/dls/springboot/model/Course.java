package com.dmantz.dls.springboot.model;

import java.sql.Date;
import java.util.ArrayList;

public class Course {
	
	private int course_id;
	private String course_name;
	private String created_by;
	private Date created_dt;
	private String recommended_duration;
	private String course_provider;
	private ArrayList<Module> modules;
	

	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Date getCreated_dt() {
		return created_dt;
	}
	public void setCreated_dt(Date created_dt) {
		this.created_dt = created_dt;
	}
	public String getRecommended_duration() {
		return recommended_duration;
	}
	public void setRecommended_duration(String recommended_duration) {
		this.recommended_duration = recommended_duration;
	}
	public String getCourse_provider() {
		return course_provider;
	}
	public void setCourse_provider(String course_provider) {
		this.course_provider = course_provider;
	}
	public ArrayList<Module> getModules() {
		return modules;
	}
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	
}
