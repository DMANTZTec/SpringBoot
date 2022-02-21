package com.dmantz.project.model;

public class HourSpentDetails {
	
	
	private int date;
	private int hoursSpent;
	
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getHoursSpent() {
		return hoursSpent;
	}
	public void setHoursSpent(int hoursSpent) {
		this.hoursSpent = hoursSpent;
	}
	public HourSpentDetails( int date, int hoursSpent) {
		super();
		
		this.date = date;
		this.hoursSpent = hoursSpent;
	}
	public HourSpentDetails() {
		
	}
	@Override
	public String toString() {
		return "HourSpentDetails [date=" + date + ", hoursSpent=" + hoursSpent + "]";
	}
	
}
