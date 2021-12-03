package com.dmantz.dls.springboot.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@Data
@AllArgsConstructor
@NoArgsConstructor*/
public class Topic {
	private int topicId;
	
	private String topicName;
	 	
	private String topicDescription;
	public Topic(String topicName, String TopicDescription) {
		this.setTopicName(topicName);
		this.setTopicDescription(TopicDescription);
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

	public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}
	
}

