package com.dmantz.project.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trainee {
	
	private String traineeId;
	private String traineeName;
	private String traineeAddress;
	private List<Course> courses;
	
	
	public Trainee(String traineeId, String traineeName, String traineeAddress, List<Course> courses) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeAddress = traineeAddress;
		this.courses=courses;
	}
	
	
	
	public String getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(String traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTraineeAddress() {
		return traineeAddress;
	}
	public void setTraineeAdress(String traineeAddress) {
		this.traineeAddress = traineeAddress;
	}



	@Override
	public String toString() {
		return String.format("Trainee[traineeId=%s,traineeName=%s,traineeAddress=%s,courses=%s]",
				traineeId,traineeName,traineeAddress,courses);

	}

	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return this.courses;
	}



	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
