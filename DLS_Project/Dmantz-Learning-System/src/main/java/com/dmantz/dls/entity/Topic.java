package com.dmantz.dls.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "topic")

public class Topic {
	@Id
	@Column(name = "topic_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int topicId;
	
	@Column(name = "topic_name")
	private String topicName;
		
	@Column(name = "topic_description")
    private String topicDescription;
	
	@Column(name = "topic_position")
	private int topicPosition;
	
	//private int moduleId;
	
	//private Module modules;
	
  @OneToMany(targetEntity = TraineeTask.class,cascade = CascadeType.ALL)
  @JoinColumn(name ="topic_id",referencedColumnName = "topic_id")
  private List<TraineeTask> traineeTasks;
	
	
	
	
//	@ManyToOne(targetEntity = Module.class,cascade = CascadeType.ALL)
//    @JoinColumn(name ="module_id",referencedColumnName = "moduleId")
//    private Module modules;
	 
	 
//	@ManyToOne(targetEntity = Module.class, fetch = FetchType.EAGER)
//	@JoinColumn(name = "module_id", insertable = false, updatable = false)
//	private Module module;
	
    
    
    
//	@Getter 
//	@Setter
//	@OneToMany(mappedBy = "topics")
//	private List<TraineeTask> traineeTasks;
	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="topicId",referencedColumnName="topicId")
//	private List<TraineeTask> traineeTasks;
	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="traineeId",referencedColumnName="traineeId")
//	private Trainee t;
	
	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="topic_id",referencedColumnName="topic_id1")
//	private List<TraineeTask> traineeTasks;
	
}