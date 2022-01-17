package com.dmantz.vamshi.commom.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="trainee")
public class Trainee {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "trainee_id")
	@Getter
	@Setter
	private int traineeId;

	@Column(name = "trainee_name")
	@Getter
	@Setter
	private String traineeName;

	@Column(name = "trainee_mail")
	@Getter
	@Setter
	private String traineeMail;

}
