package com.dmantz.vamshi.springboot.common.model;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Module {
	private int moduleId;
	private String moduleName;
	private int moduleIndex;
	private int CourseId;
	
}
