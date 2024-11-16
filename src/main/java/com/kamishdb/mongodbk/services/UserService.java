package com.kamishdb.mongodbk.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamishdb.mongodbk.models.User;
import com.kamishdb.mongodbk.repositories.UserRepository;

@Service
public class UserService  {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
}
