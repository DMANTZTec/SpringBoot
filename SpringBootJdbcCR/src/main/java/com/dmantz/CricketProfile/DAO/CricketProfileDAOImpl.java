package com.dmantz.CricketProfile.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.dmantz.CricketProfile.Model.Profile;
@Repository
public class CricketProfileDAOImpl implements CricketProfileDAO {
     
	@Autowired JdbcTemplate jdbcTemplate;
	@Override
	public int createProfile(Profile profile) {
		System.out.println("Enter in to createprofile "+jdbcTemplate);
		KeyHolder keyholder=new GeneratedKeyHolder();
		jdbcTemplate.update((Connection connection)->{
			PreparedStatement preparedstatement;
			preparedstatement=connection.prepareStatement("INSERT INTO PROFILE(ID,NAME,RUNS,WICKETS) VALUES(?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			preparedstatement.setString(1,profile.getProfileId());
			preparedstatement.setString(2,profile.getName());
			preparedstatement.setString(3,profile.getRuns());
			preparedstatement.setString(4,profile.getWickets());
			
			return preparedstatement;
		},keyholder);
		
		return keyholder.getKey().intValue();
			
		}	

	@Override
	public List<Profile> getProfiles() {
		System.out.println("Enter in to getprofile ");
		List<Profile> profileList=new ArrayList<>();
		Collection<Map<String,Object>> rows=null;
		rows=jdbcTemplate.queryForList("SELECT ID,NAME,RUNS,WICKETS FROM PROFILE");
		rows.stream().map((row)->{
			Profile p=new Profile();
			p.setProfileId(String.valueOf(row.get("ID")));
			p.setName((String) row.get("NAME"));
			p.setRuns((String) row.get("RUNS"));
			p.setWickets((String) row.get("WICKETS"));
		
			return p;
			}).forEach(ss ->{
				
				profileList.add(ss);
				
		});
		return profileList;
	}
}
