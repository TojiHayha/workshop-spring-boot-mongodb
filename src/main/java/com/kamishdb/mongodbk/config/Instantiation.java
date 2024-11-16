package com.kamishdb.mongodbk.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.kamishdb.mongodbk.models.User;
import com.kamishdb.mongodbk.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository; 
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
	
		User u1 = new User(null, "Maky", "Maky@gmail.com");
		User u2 = new User(null, "Junior", "Junior@gmail.com");
		User u3 = new User(null, "Mahra", "Mahra@gmail.com");
	
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		
	}

}
