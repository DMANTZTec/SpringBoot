package com.dmantz.project.model;

import java.sql.Date;
import java.util.List;

public class TraineeCourseDetail {
	
	private int traineeCourseId;
	private int traineeId;
	private int courseId;
	private Date startDate;
	private Date endDate;
	private String status;
	private int hoursSpent;
	private Date assignedDate;
	private String assignedBy;
	private List<Courses> courses;
	public int getTraineeCourseId() {
		return traineeCourseId;
	}
	public void setTraineeCourseId(int traineeCourseId) {
		this.traineeCourseId = traineeCourseId;
	}
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getHoursSpent() {
		return hoursSpent;
	}
	public void setHoursSpent(int hoursSpent) {
		this.hoursSpent = hoursSpent;
	}
	public Date getAssignedDate() {
		return assignedDate;
	}
	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}
	public String getAssignedBy() {
		return assignedBy;
	}
	public void setAssignedBy(String assignedBy) {
		this.assignedBy = assignedBy;
	}
	public List<Courses> getCourses() {
		return courses;
	}
	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	public TraineeCourseDetail() {
		
	}
	public TraineeCourseDetail(int traineeCourseId, int traineeId, int courseId, Date startDate, Date endDate,
			String status, int hoursSpent, Date assignedDate, String assignedBy, List<Courses> courses) {
		super();
		this.traineeCourseId = traineeCourseId;
		this.traineeId = traineeId;
		this.courseId = courseId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
		this.hoursSpent = hoursSpent;
		this.assignedDate = assignedDate;
		this.assignedBy = assignedBy;
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "TraineeCourseDetail [traineeCourseId=" + traineeCourseId + ", traineeId=" + traineeId + ", courseId="
				+ courseId + ", startDate=" + startDate + ", endDate=" + endDate + ", status=" + status
				+ ", hoursSpent=" + hoursSpent + ", assignedDate=" + assignedDate + ", assignedBy=" + assignedBy
				+ ", courses=" + courses + "]";
	}
	
	

}
