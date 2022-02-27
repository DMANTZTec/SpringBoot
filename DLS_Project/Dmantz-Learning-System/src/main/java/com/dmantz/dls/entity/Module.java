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
@Table(name = "module")

public class Module {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)

	@Column(name = "module_id")
	private int moduleId;
	
	@Column(name = "module_name")
	private String moduleName;
	
	@Column(name = "module_position")	
	private int modulePosition;

	@Column(name = "module_description")
	private String moduleDescription;
	
//	private Course courses;
	
	
	 @OneToMany(targetEntity = Topic.class,cascade = CascadeType.ALL)
     @JoinColumn(name ="module_id",referencedColumnName = "module_id")
	 private List<Topic> topics;
	 
	 
	
//	@ManyToOne(targetEntity = Course.class, fetch = FetchType.EAGER)
//	@JoinColumn(name = "course_id", insertable = false, updatable = false)
//	private Course course;
//	
//	@OneToMany(mappedBy = "module")
//	@Getter 
//	@Setter
//	private List<Topic> topics;
	
}

