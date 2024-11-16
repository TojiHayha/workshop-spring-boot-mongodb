package com.kamishdb.mongodbk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamishdb.mongodbk.models.User;
import com.kamishdb.mongodbk.repositories.UserRepository;
import com.kamishdb.mongodbk.services.exceptions.ObjectNotFoundException;

@Service
public class UserService  {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Id não encontrado: " + id));
	}
	
}
