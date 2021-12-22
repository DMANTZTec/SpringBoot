package com.dmantz.vamshi.commom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepositiory userRepositiory;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=userRepositiory.getUserByUsername(username);
		if(user==null)
		{
			throw new UsernameNotFoundException("could not found user");
		}
		return new MyUserDetails(user);
	}

}
