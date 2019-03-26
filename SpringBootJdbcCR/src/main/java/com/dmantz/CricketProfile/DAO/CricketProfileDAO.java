package com.dmantz.CricketProfile.DAO;

import java.util.List;

import com.dmantz.CricketProfile.Model.Profile;

public interface CricketProfileDAO {
	
	public abstract int createProfile(Profile profile);
	
    public abstract List<Profile> getProfiles();
}
