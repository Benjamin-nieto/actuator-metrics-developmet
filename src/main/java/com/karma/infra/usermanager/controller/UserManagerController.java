package com.karma.infra.usermanager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.karma.infra.usermanager.model.Users;
import com.karma.infra.usermanager.repository.UsersRepository;

@RestController
@RequestMapping("/api")
public class UserManagerController {

	@Autowired
	UsersRepository userRepository;
	
	@GetMapping("/")
	public String init() {
		// TODO Auto-generated method stub
		return "OK";
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<Users>> getAllUsers(@RequestParam(required = false) String name){
	try{
	List<Users> allUsers = new ArrayList<Users>();
	
	if (name == null) {
		userRepository.findAll().forEach(allUsers::add);
		
	} else {

		userRepository.findByName(name).forEach(allUsers::add);
	}
	
	if (allUsers.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	return new ResponseEntity<>(allUsers,HttpStatus.OK);
	}catch (Exception e) {
		// TODO: handle exception
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
				
	}
	
	
	
	
	
}
