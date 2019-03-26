package com.dmantz.CricketProfile.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dmantz.CricketProfile.DAO.CricketProfileDAO;
import com.dmantz.CricketProfile.Model.Profile;

@RestController
@RequestMapping("/user")
public class CricketProfileController {
	
	@Autowired CricketProfileDAO cricketprofiledao;
	
	@RequestMapping(value="/createProfile")
	public ResponseEntity<Object> createProfile(Profile profile){
		//profile.setProfileId("6");
		profile.setName("SanthoshReddy");
		profile.setRuns("50");
		profile.setWickets("5");
		
		cricketprofiledao.createProfile(profile);
		return new ResponseEntity<Object>("Profile is created successfully", HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/getProfiles")
	public ResponseEntity<Object> getProfiles(){
		
		
		return new ResponseEntity<Object>(cricketprofiledao.getProfiles(),HttpStatus.OK);
	}
	
	

}
