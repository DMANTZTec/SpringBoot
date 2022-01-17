package com.dmantz.dls.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "topic")

public class Topic {
	@Id
	@Column(name = "topic_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private int topicId;
	
	@Column(name = "topic_name")
	@Getter
	@Setter
	private String topicName;
	
	@Column(name = "topic_description")
	@Getter
	@Setter
	private String topicDescription;
	
	
	@Column(name = "topic_index")
	@Getter
	@Setter
	private int topicIndex;
	
	@Column(name = "module_id")
	@Getter
	@Setter
	private int moduleId;
	
	@ManyToOne(targetEntity = Module.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "module_id", insertable = false, updatable = false)
	private Module module;
	
}