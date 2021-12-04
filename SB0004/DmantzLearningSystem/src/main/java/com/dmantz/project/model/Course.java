package com.dmantz.project.model;

import java.util.List;

public class Course {
	private String index;
	private String name;
	private String description;
	private List<String> modules;
	
	public Course(String index, String name, String description, List<String> modules) {
		super();
		this.index = index;
		this.name = name;
		this.description = description;
		this.modules = modules;
	}
	
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getModules() {
		return modules;
	}
	public void setModules(List<String> modules) {
		this.modules = modules;
	}

	@Override
	public String toString() {
		return "Course [index=" + index + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
}
