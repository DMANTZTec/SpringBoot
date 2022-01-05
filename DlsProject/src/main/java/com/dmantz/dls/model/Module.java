package com.dmantz.dls.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Module {
private int module_id;
private String module_name;
private int course_id;
}
