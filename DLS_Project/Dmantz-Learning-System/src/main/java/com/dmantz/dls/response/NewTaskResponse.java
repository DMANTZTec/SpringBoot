package com.dmantz.dls.response;

import java.sql.Date;

public class NewTaskResponse {
	
	private int traineeTaskId;
	private int traineeId;
	private int topicId;
	
	public NewTaskResponse(int traineeTaskId, int traineeId, int topicId, Date startDate, Date endDate) {
		super();
		this.traineeTaskId = traineeTaskId;
		this.traineeId = traineeId;
		this.topicId = topicId;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "NewTaskResponse [traineeTaskId=" + traineeTaskId + ", traineeId=" + traineeId + ", topicId=" + topicId
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	private Date startDate;
	private Date endDate;
	public long getTraineeTaskId() {
		return traineeTaskId;
	}
	public void setTraineeTaskId(int traineeTaskId) {
		this.traineeTaskId = traineeTaskId;
	}
	
	
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
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
	
	
	



}
