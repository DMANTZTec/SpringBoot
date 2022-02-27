package com.dmantz.dls.entity;


import java.util.Date;
import java.util.List;
//import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
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
@Table(name = "course")

public class Course {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "course_id")
	private int courseId;
	
	
	@Column(name = "course_name")
	private String courseName;
	
	@Column(name = "created_by")
	private String createdBy;
	
	
	@Column(name = "course_dt")
	private Date createdDt;
	
	@Column(name = "recommended_duration")
	private String recommendedDuration;
	
	
	@Column(name = "course_provider")
	private String courseProvider;
	

	 @OneToMany(targetEntity = Module.class,cascade = CascadeType.ALL)
	 @JoinColumn(name ="course_id",referencedColumnName = "course_id")
     private List<Module> modules;
	 
	 
	
//	@Getter 
//	@Setter
//	@OneToMany(mappedBy = "course")
//	private List<Module> modules;
	
//	@ManyToOne(targetEntity = Worklog.class, fetch = FetchType.EAGER)
//	@JoinColumn(name = "worklog_id", insertable = false, updatable = false)
//	private Worklog worklog;
	
	

}
                  