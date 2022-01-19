package com.dmantz.vamshi.common.entity;

import java.util.Date;
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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="module")
public class Module {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "module_id")
	@Getter
	@Setter
	private int moduleId;
	
	@Column(name = "module_name")
	@Getter
	@Setter
	private String moduleName;
	
	@Column(name = "module_index")
	@Getter
	@Setter
	private int moduleIndex;
	@Column(name = "course_id")
	@Getter
	@Setter
	private int courseId;
	@Column(name = "module_desccription")
	@Getter
	@Setter
	private String moduleDescription;
	
	@ManyToOne(targetEntity = CourseDetail.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "course_id", insertable = false, updatable = false)
	private CourseDetail course;
	
	
	 @OneToMany(mappedBy = "module")
	 @Getter
	@Setter
	private List<Topic> topics;
	 
	 @ManyToOne(targetEntity = TraineeCoursesDetail.class, fetch = FetchType.EAGER)
		@JoinColumn(name = "course_id", insertable = false, updatable = false)
		private TraineeCoursesDetail TraineeCoursdetail;
	
	 
	  
	

}
