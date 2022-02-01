package com.dmantz.project.model;

import java.util.List;

public class CourseModule {
	
	private int moduleId;
	private String moduleName;
	private String moduleDescription;
	private int moduleHours;
	private List<Topic> topicList;
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
	public String getModuleDescription() {
		return moduleDescription;
	}
	public void setModuleDescription(String moduleDescription) {
		this.moduleDescription = moduleDescription;
	}
	public int getModuleHours() {
		return moduleHours;
	}
	public void setModuleHours(int moduleHours) {
		this.moduleHours = moduleHours;
	}
	public List<Topic> getTopicList() {
		return topicList;
	}
	public void setTopicList(List<Topic> topicList) {
		this.topicList = topicList;
	}
	public CourseModule(int moduleId, String moduleName, String moduleDescription, int moduleHours,
			List<Topic> topicList) {
		super();
		this.moduleId = moduleId;
		this.moduleName = moduleName;
		this.moduleDescription = moduleDescription;
		this.moduleHours = moduleHours;
		this.topicList = topicList;
	}
	public CourseModule() {
		
	}
	@Override
	public String toString() {
		return "Module [moduleId=" + moduleId + ", moduleName=" + moduleName + ", moduleDescription="
				+ moduleDescription + ", moduleHours=" + moduleHours + ", topicList=" + topicList + "]";
	}
	
	
	

}
