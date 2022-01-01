package com.dmantz.dls.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trainee_Course {
	private int tc_id;
	private int trainee_id;
	private int course_id;
	private String trainee_name;
}
