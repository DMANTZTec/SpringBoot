package com.dmantz.project.model;

import java.util.List;

public class Courses {
	

	private int courseId;
	private String courseName;
	private String createdBy;
	private String createdDate;
	private String courseProvider;
	private String recommendedDuration;
	private List<CourseModule> moduleList;
	
	public Courses(int courseId, String courseName, String createdBy,String createdDate,String courseProvider,String recommendedDuration, List<String> modules) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.createdBy=createdBy;
		this.createdDate=createdDate;
		this.courseProvider=courseProvider;
		this.recommendedDuration = recommendedDuration;
		
	}
	public Courses() {
		
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
	public List<CourseModule> getModuleList() {
		return moduleList;
	}
	public void setModuleList(List<CourseModule> moduleList) {
		this.moduleList = moduleList;
	}
	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", courseProvider=" + courseProvider + ", recommendedDuration="
				+ recommendedDuration + ", moduleList=" + moduleList + "]";
	}

	
	
	
}
