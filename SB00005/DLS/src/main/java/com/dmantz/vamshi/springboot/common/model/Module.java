package com.dmantz.vamshi.springboot.common.model;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Module {
	private int moduleId;
	private String moduleName;
	private ArrayList<Topic> topics;
	
}
