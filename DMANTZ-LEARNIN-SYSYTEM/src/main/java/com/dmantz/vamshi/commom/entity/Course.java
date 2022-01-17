package com.dmantz.vamshi.commom.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	@Getter
	@Setter
	private int courseId;
    @Column(name = "course_name")
	@Getter
	@Setter
	private String courseName;
    @Column(name = "created_date")
   	@Getter
   	@Setter
	private Date createdDAte;
    @Column(name = "created_by")
   	@Getter
   	@Setter
	private String createdBy;
    @Column(name = "course_duration")
   	@Getter
   	@Setter
	private int recommendedDuration;
    @Column(name = "course_provider")
   	@Getter
   	@Setter
	private String courseProvider;
    @Getter
   	@Setter
    @OneToMany(mappedBy = "course")
	private List<Module> modules;

}
