package com.dmantz.springboot.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.springboot.model.PassengerInfo;
import com.dmantz.springboot.response.TicketInfo;

@RestController
public class AirIndiaRestController {
	
	
	@PostMapping("/book")
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo pinfo){
		//logic to book ticket
		
		//send ticket info
		
		TicketInfo ticket = new TicketInfo();
		ticket.setName(pinfo.getFname()+" "+pinfo.getLname());
		ticket.setFrom(pinfo.getFrom());
		ticket.setTo(pinfo.getTo());
		ticket.setTicketStatus("CONFIRMED");
		ticket.setJourneyDate(pinfo.getJourneyDate());
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
				
		
		  
	}

}

