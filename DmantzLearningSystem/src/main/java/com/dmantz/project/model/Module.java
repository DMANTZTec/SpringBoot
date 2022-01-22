package com.dmantz.project.model;

import java.util.List;

public class Module {
	
	private int moduleId;
	private String moduleName;
	private List<Topic> topics;
	
	public Module(int moduleId, String moduleName, List<Topic> topics) {
		super();
		this.moduleId = moduleId;
		this.moduleName = moduleName;
		this.topics = topics;
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
	public List<Topic> getTopics() {
		return topics;
	}
	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	
	}
	
	

}
