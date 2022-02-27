package com.dmantz.dls.response;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Table;

import com.dmantz.dls.request.OngoingTaskRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)


public class OngoingTaskResponse {		

    @Column(name="trainee_task_id")
	private int traineeTaskId;
	
    @Column(name="start_date")
	private Date startDate;
	
    @Column(name="end_date")
	private Date endDate;
	
    @Column(name="topic_id")
	private int topicId;

    @Column(name="topic_name")
	private String topicName;
	
    @Column(name="module_id")
	private int moduleId;
	
    @Column(name="module_name")
    private String moduleName;
	
    @Column(name="course_id")
	private int courseId;
	
    @Column(name="course_name")
	private String courseName;
    
    @Column(name="no_of_hours")
    private String noOfHours;
    
    
	
//	private int moduleId;
//	
//	private String moduleName;
	 
	//private int courseId;

	//private String courseName;
	
//	private Date logDate;
//	
//	


	
	
	
	
	}
	

