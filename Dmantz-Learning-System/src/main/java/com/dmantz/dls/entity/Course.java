package com.dmantz.dls.entity;


import java.util.Date;
import java.util.List;
//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
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
@Table(name = "course")

public class Course {
	@Id
	@Column(name = "course_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private int courseId;
	
	@Column(name = "course_name")
	@Getter
	@Setter
	private String courseName;
	
	@Column(name = "created_by")
	@Getter
	@Setter
	private String createdBy;
	
	@Column(name = "created_dt")
	@Getter
	@Setter
	private Date createdDt;
	
	@Column(name = "recommended_duration")
	@Getter
	@Setter
	private String recommendedDuration;
	
	@Column(name = "course_provider")
	@Getter
	@Setter
	private String courseProvider;
	
	@Getter 
	@Setter
	@OneToMany(mappedBy = "course")
	private List<Module> modules;
	
	
//	@ManyToOne(targetEntity = Worklog.class, fetch = FetchType.EAGER)
//	@JoinColumn(name = "worklog_id", insertable = false, updatable = false)
//	private Worklog worklog;
	
	

}
