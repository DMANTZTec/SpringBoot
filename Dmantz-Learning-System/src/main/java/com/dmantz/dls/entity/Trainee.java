package com.dmantz.dls.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "trainee")

public class Trainee {
	@Id
	@Column(name = "trainee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private int traineeId;
	
	@Column(name = "trainee_name")
	@Getter
	@Setter
	private String traineeName;
	
	@Column(name = "trainee_email")
	@Getter
	@Setter
	private int traineeEmail;
	
	@Column(name = "course_id")
	@Getter
	@Setter
	private int courseId;
	
}
