package com.abocado.spring.ex.jsp.service;

import org.springframework.stereotype.Service;

import com.abocado.spring.ex.jsp.domain.User;

@Service
public class UserService {
	
	public int addUserByObject(User user) {
		int count = userRepository.insertUserByObject(user);
		
		return count;
	}
	
	public User getLastUser() {
		
	}
	
}
