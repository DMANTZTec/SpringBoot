package com.dmantz.project.model;

public class Topic {

	
    private int topicId;
    private String topicName;
    private String topicDescription;
    private int topicHours;
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
	public String getTopicDescription() {
		return topicDescription;
	}
	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}
	public int getTopicHours() {
		return topicHours;
	}
	public void setTopicHours(int topicHours) {
		this.topicHours = topicHours;
	}
	public Topic(int topicId, String topicName, String topicDescription, int topicHours) {
		super();
		this.topicId = topicId;
		this.topicName = topicName;
		this.topicDescription = topicDescription;
		this.topicHours = topicHours;
	}
	public Topic() {
		
	}
	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", topicName=" + topicName + ", topicDescription=" + topicDescription
				+ ", topicHours=" + topicHours + "]";
	}
    
    
   
	
}
