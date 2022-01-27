package com.dmantz.project.model;

import java.sql.Date;

public class MyTask {
	
	private int traineeTaskId;
	private int courseId;
	private String courseName;
	private int moduleId;
	private String moduleName;
	private int topicId;
	private String topicName;
	private Date startDate;
	private Date endDate;
	private Date logDate;
	private int noOfHours;
	public int getTraineeTaskId() {
		return traineeTaskId;
	}
	public void setTraineeTaskId(int traineeTaskId) {
		this.traineeTaskId = traineeTaskId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getLogDate() {
		return logDate;
	}
	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}
	public int getNoOfHours() {
		return noOfHours;
	}
	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}
	
	public MyTask()
	{
		
	}
	public MyTask(int traineeTaskId, int courseId, String courseName, int moduleId, String moduleName, int topicId,
			String topicName, Date startDate, Date endDate, Date logDate, int noOfHours) {
		super();
		this.traineeTaskId = traineeTaskId;
		this.courseId = courseId;
		this.courseName = courseName;
		this.moduleId = moduleId;
		this.moduleName = moduleName;
		this.topicId = topicId;
		this.topicName = topicName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.logDate = logDate;
		this.noOfHours = noOfHours;
	}
	@Override
	public String toString() {
		return "MyTask [traineeTaskId=" + traineeTaskId + ", courseId=" + courseId + ", courseName=" + courseName
				+ ", moduleId=" + moduleId + ", moduleName=" + moduleName + ", topicId=" + topicId + ", topicName="
				+ topicName + ", startDate=" + startDate + ", endDate=" + endDate + ", logDate=" + logDate
				+ ", noOfHours=" + noOfHours + "]";
	}

}
