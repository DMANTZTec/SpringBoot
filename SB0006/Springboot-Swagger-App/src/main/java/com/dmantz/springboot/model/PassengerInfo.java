package com.dmantz.springboot.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PassengerInfo {
	private String fname;
	private String lname;
	private String from;
	private String to;
	private String flightId;
	private String journeyDate;
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	@Override
	public String toString() {
		return "PassengerInfo [fname=" + fname + ", lname=" + lname + ", from=" + from + ", to=" + to + ", flightId="
				+ flightId + ", journeyDate=" + journeyDate + "]";
	}
	public PassengerInfo(String fname, String lname, String from, String to, String flightId, String journeyDate) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.from = from;
		this.to = to;
		this.flightId = flightId;
		this.journeyDate = journeyDate;
	}
	public PassengerInfo() {
		
	}



}
