package com.dmantz.EcommerceApplicationModel;

public class Options {
	
	private Integer optionId;
	
	private String optionName;
	
	private String optionValue;

	public Options() {
		
	}

	public Options(int option_id, String option_name, String option_value) {
	
		this.optionId=option_id;
		this.optionName=option_name;
		this.optionValue=option_value;
	}

	public Integer getOptionId() {
		return optionId;
	}

	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public String getOptionValue() {
		return optionValue;
	}

	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

	
}
