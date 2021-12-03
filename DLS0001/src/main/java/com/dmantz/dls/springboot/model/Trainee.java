package com.dmantz.dls.springboot.model;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Trainee {
	
	private int trainee_id;
	private String trainee_name;
	private String trainee_email;
	private int course_id;
	
	public Trainee(String trainee_name, String trainee_email, int course_id) {
		this.setTrainee_name(trainee_name);
		this.setTrainee_email(trainee_email);
		this.setCourse_id(course_id);
	}
	public int getTrainee_id() {
		return trainee_id;
	}
	public void setTrainee_id(int trainee_id) {
		this.trainee_id = trainee_id;
	}
	public String getTrainee_name() {
		return trainee_name;
	}
	public void setTrainee_name(String trainee_name) {
		this.trainee_name = trainee_name;
	}
	public String getTrainee_email() {
		return trainee_email;
	}
	public void setTrainee_email(String trainee_email) {
		this.trainee_email = trainee_email;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	

}
