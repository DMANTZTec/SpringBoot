package com.dmantz.project.model;

import java.sql.Date;

public class TraineeTask {
	
	private int traineeTaskId;
	private int traineeId;
	private int topicId;
	private Date startDate;
	
	private String endDate; 
	
	
	public int getTraineeTaskId() {
		return traineeTaskId;
	}
	public void setTraineeTaskId(int traineeTaskId) {
		this.traineeTaskId = traineeTaskId;
	}
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public TraineeTask(int traineeTaskId, int traineeId, int topicId, Date startDate,  String endDate) {
		super();
		this.traineeTaskId = traineeTaskId;
		this.traineeId = traineeId;
		this.topicId = topicId;
		this.startDate = startDate;
		
		this.endDate=endDate;
	}
	@Override
	public String toString() {
		return "TraineeTask [traineeTaskId=" + traineeTaskId + ", traineeId=" + traineeId + ", topicId=" + topicId
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	public String getendDate() {
		return endDate;
	}
	public void setendDate(String endDate) {
		this.endDate= endDate;
	}

}
