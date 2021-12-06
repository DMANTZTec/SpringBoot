package com.dmantz.project.model;

import java.util.List;

public class Course {
	private String courseId;
	private String courseName;
	private String createdBy;
	private String recommendedDuration;
	private List<String> modules;
	
	public Course(String courseId, String courseName, String createdBy,String recommendedDuration, List<String> modules) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.createdBy=createdBy;
		this.recommendedDuration = recommendedDuration;
		this.modules = modules;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
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

	public List<String> getModules() {
		return modules;
	}

	public void setModules(List<String> modules) {
		this.modules = modules;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", createdBy=" + createdBy
				+ ", recommendedDuration=" + recommendedDuration + ", modules=" + modules + "]";
	}
	
	
	
}
