package com.dmantz.techworklog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="techworklog")
public class User {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	@Column(name="subject")
	private String subject;
	@Column(name="module")
	private String module;
	@Column(name="topic_id")
	private String topicId;
	@Column(name="topic_name")
	private String topicName;
	/*@Column(name="estimate_hours")
	private String estimateHours;
	@Column(name="actual_hours")
	private String actualHours;*/
	@Column(name="file_type")
	private String fileType;
		
	public User() {
	
		
	}
	
	public User(String name, String subject, String module, String topicId, String topicName,
			String estimateHours, String actualHours, String fileType) {
		super();
		this.name = name;
		this.subject = subject;
		this.module = module;
		this.topicId = topicId;
		this.topicName = topicName;
		/*this.estimateHours = estimateHours;
		this.actualHours = actualHours;*/
		this.fileType = fileType;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	/*public String getEstimateHours() {
		return estimateHours;
	}

	public void setEstimateHours(String estimateHours) {
		this.estimateHours = estimateHours;
	}

	public String getActualHours() {
		return actualHours;
	}

	public void setActualHours(String actualHours) {
		this.actualHours = actualHours;
	}*/

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
	@Transient
	private MultipartFile file;	
	
	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}


	
}



