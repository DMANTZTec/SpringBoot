package com.dmantz.vamshi.common.entity;

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

import org.springframework.data.repository.query.parser.Part.IgnoreCaseType;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@Getter
	@Setter
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "trainee_id", referencedColumnName = "trainee_id")

	private List<TraineeCourses> traineeCourses;
	
	
	
	
}
