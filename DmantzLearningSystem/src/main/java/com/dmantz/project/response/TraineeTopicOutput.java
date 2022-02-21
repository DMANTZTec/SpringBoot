package com.dmantz.project.response;

public class TraineeTopicOutput {
	
	private long traineeTaskId;
	private String status;
	public long getTraineeTaskId() {
		return traineeTaskId;
	}
	public void setTraineeTaskId(long traineeTaskId) {
		this.traineeTaskId = traineeTaskId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public  TraineeTopicOutput() {
		
	}
	public TraineeTopicOutput(long traineeTaskId, String status) {
		super();
		this.traineeTaskId = traineeTaskId;
		this.status = status;
	}
	@Override
	public String toString() {
		return "TraineeTopicOutput [traineeTaskId=" + traineeTaskId + ", status=" + status + "]";
	}

}
