package com.dmantz.dls.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topic {
	private int topic_id;
	
	private String topic_name;
	 	
	private String topic_description;
	
	private int topic_index;
	
	private int module_id;

	
	
}

