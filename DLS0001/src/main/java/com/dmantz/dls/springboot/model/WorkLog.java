package com.dmantz.dls.springboot.model;

import java.util.Date;

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
public class WorkLog {
	public Trainee traineeId;
	public Course courseId;
	public Module moduleId;
	public Topic topicId;
	public Date endDate;
	public String status;

}
