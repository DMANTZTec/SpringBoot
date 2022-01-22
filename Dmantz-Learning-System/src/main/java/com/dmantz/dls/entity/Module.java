package com.dmantz.dls.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "module")

public class Module {
	@Id
	@Column(name = "module_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private int moduleId;
	
	@Column(name = "module_name")
	@Getter
	@Setter
	private String moduleName;
	
	@Column(name = "course_id")
	@Getter
	@Setter
	private int courseId;
	
	
	@Column(name = "module_position")
	@Getter
	@Setter
	private int modulePosition;
	
	@Column(name = "module_description")
	@Getter
	@Setter
	private String moduleDescription;
	
	@ManyToOne(targetEntity = Course.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "course_id", insertable = false, updatable = false)
	private Course course;
	
	@OneToMany(mappedBy = "module")
	@Getter 
	@Setter
	private List<Topic> topics;
	
}

