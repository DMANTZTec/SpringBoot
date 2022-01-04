package com.dmantz.springboot.response;

import lombok.Data;

@Data
public class TicketInfo {
	
	private String name;
	private String from;
	private String to;
	private String flightId;
	private String journeyDate;
	private String ticketPrice;
	private String ticketStatus;
	public TicketInfo(String name, String from, String to, String flightId, String journeyDate, String ticketPrice,
			String ticketStatus) {
		super();
		this.name = name;
		this.from = from;
		this.to = to;
		this.flightId = flightId;
		this.journeyDate = journeyDate;
		this.ticketPrice = ticketPrice;
		this.ticketStatus = ticketStatus;
	}
	public TicketInfo()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	@Override
	public String toString() {
		return "TicketInfo [name=" + name + ", from=" + from + ", to=" + to + ", flightId=" + flightId
				+ ", journeyDate=" + journeyDate + ", ticketPrice=" + ticketPrice + ", ticketStatus=" + ticketStatus
				+ "]";
	}
	

}
