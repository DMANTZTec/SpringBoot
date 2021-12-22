package com.dmantz.vamshi.commom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class CustomUserDetailService implements UserDetailsService {
	@Autowired
	private userRepository userRepository;
	

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Model user=userRepository.findByUserName(userName);
		if(user==null)
		{
			throw new UsernameNotFoundException("user not found");
		}
		return new CustomUserDetails(user);
	}

}
