package com.kamishdb.mongodbk.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kamishdb.mongodbk.models.User;

@RestController
@RequestMapping(value="/users")
public class UserController {

	// testando a requisição 
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User test1 = new User("1", "Kaiser", "Kaiser@gmail.com"); 
		User test2 = new User("2", "Kami", "Kami@gmail.com"); 
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(test1, test2));
		return ResponseEntity.ok().body(list); 
	}
}
