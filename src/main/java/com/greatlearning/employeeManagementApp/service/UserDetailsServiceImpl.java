package com.greatlearning.employeeManagementApp.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.employeeManagementApp.dao.UserRepository;
import com.greatlearning.employeeManagementApp.entity.User;
import com.greatlearning.employeeManagementApp.security.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService {
	
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.getUserByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException("Could not find user");
		}

		return new MyUserDetails(user);
	}

}
