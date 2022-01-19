package com.dmantz.vamshi.common.entity;

import java.util.Date;
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
@Table(name = "trainee_course")
public class TraineeCoursesDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tc_id")
	@Getter
	@Setter
	private int id;
	@Column(name = "course_id")
	@Getter
	@Setter
	private int courseId;
	@Column(name = "course_name")
	@Getter
	@Setter
	private String courseName;
	@Column(name = "status")
	@Getter
	@Setter
	private String courseStatus;
	@Column(name = "trainee_id")
	@Getter
	@Setter
	private int traineeId;
	@Column(name = "start_Dt")
	@Getter
	@Setter
	private Date startDate;
	@Column(name = "end_dt")
	@Getter
	@Setter
	private Date endDate;
	@Column(name = "hours_spent")
	@Getter
	@Setter
	private String hoursSpent;
	

	 @OneToMany(mappedBy = "TraineeCoursdetail")
	 @Getter
	@Setter
	private List<Module> modules;

	
	
	

	

	
}
