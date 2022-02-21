package com.dmantz.project.request;

public class TraineeTopicInput {
	
	private int traineeId;
	private int topicId;
	
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public TraineeTopicInput(int traineeId, int topicId) {
		super();
		this.traineeId = traineeId;
		this.topicId = topicId;
	}
	@Override
	public String toString() {
		return "TraineeTopicInput [traineeId=" + traineeId + ", topicId=" + topicId + "]";
	}

}
