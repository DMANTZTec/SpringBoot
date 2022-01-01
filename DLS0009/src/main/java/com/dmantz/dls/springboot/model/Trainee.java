package com.dmantz.dls.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trainee {
	
	private int trainee_id;
	private String trainee_name;
	private String trainee_email;
	private int course_id;

	

}
