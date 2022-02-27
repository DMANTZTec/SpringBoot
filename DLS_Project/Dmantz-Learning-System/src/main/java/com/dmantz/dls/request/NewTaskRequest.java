package com.dmantz.dls.request;

public class NewTaskRequest {
	
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
	public NewTaskRequest(int traineeId, int topicId) {
		super();
		this.traineeId = traineeId;
		this.topicId = topicId;
	}
	@Override
	public String toString() {
		return "TraineeTopicInput [traineeId=" + traineeId + ", topicId=" + topicId + "]";
	}


}


	



























	
	
	
//	@Query(value="CALL get_my_task",nativeQuery=true)
//	public List<TraineeTask> findByTraineeId(int traineeId) {
//		return null;
//	}
//	
	
	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinTable(name="trainee_task", joinColumns=@JoinColumn(name="new_task_request_id"),inverseJoinColumns=@JoinColumn(name="trainee_task_id"))
//	@JoinColumn(name="traineeTaskId", referencedColumnName="newTaskRequestId")
//	List<TraineeTask> traineeTasks;
	
	
//	public List<Trainee> getAll(){
//		return null;
//	}
//	@Override
//	public String toString() {
//		return null;
//	}

	
	
	

	
	
	
	
	
	
	


