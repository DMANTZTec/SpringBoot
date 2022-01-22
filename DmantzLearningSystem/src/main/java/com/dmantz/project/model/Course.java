package com.dmantz.project.model;

import java.util.List;

public class Course {
	private int courseId;
	private String courseName;
	private String createdBy;
	private String createdDate;
	private String courseProvider;
	private String recommendedDuration;

	
	public Course(int courseId, String courseName, String createdBy,String createdDate,String courseProvider,String recommendedDuration, List<String> modules) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.createdBy=createdBy;
		this.createdDate=createdDate;
		this.courseProvider=courseProvider;
		this.recommendedDuration = recommendedDuration;
		
	}
	public Course() {
		
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

	public String getRecommendedDuration() {
		return recommendedDuration;
	}

	public void setRecommendedDuration(String recommendedDuration) {
		this.recommendedDuration = recommendedDuration;
	}

	

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getCourseProvider() {
		return courseProvider;
	}

	public void setCourseProvider(String courseProvider) {
		this.courseProvider = courseProvider;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", courseProvider=" + courseProvider + ", recommendedDuration="
				+ recommendedDuration + "]";
	}
	
	
	
}
