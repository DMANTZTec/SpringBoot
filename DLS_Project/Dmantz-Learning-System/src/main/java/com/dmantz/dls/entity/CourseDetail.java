//package com.dmantz.dls.entity;
//
//import java.util.Date;
//import java.util.List;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "course")
//public class CourseDetail {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "course_id")
//	@Getter
//	@Setter
//	private int courseId;
//	@Column(name = "course_name")
//	@Getter
//	@Setter
//	private String courseName;
//	@Column(name = "created_date")
//	@Getter
//	@Setter
//	private Date createdDAte;
//	@Column(name = "created_by")
//	@Getter
//	@Setter
//	private String createdBy;
//	@Column(name = "course_duration")
//	@Getter
//	@Setter
//	private String recommendedDuration;
//	@Column(name = "course_provider")
//	@Getter
//	@Setter
//	private String courseProvider;
//
//	@Getter
//	@Setter
//	@OneToMany(mappedBy = "course")
//	private List<Module> modules;
//
//	@ManyToOne(targetEntity = TraineeCourseDetail.class, fetch = FetchType.EAGER)
//	@JoinColumn(name = "course_id", insertable = false, updatable = false)
//	private TraineeCourseDetail TraineeCoursdetail;
//
//}
