package com.abocado.spring.ex.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abocado.spring.ex.ajax.domain.User;
import com.abocado.spring.ex.ajax.repository.NewUserRepository;

@Service
public class NewUserService {
	
	@Autowired
	private NewUserRepository userRepository;
	
	public List<User> getUserList() {
		List<User> userList = userRepository.selectUserList();
		return userList;
	}
	
	public int addUser(
			String name
			, String birthday
			, String email
			, String introduce
			) {
		int count = userRepository.insertUser(name, birthday, email, introduce);
		return count;
	}
}
