package com.pst.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pst.user.entity.UserEntity;
import com.pst.user.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping
	public UserEntity addUser(@RequestBody UserEntity user ) {
		
	 return	service.addUser(user);
	}
	 
	@GetMapping("/all-users")
	public List<UserEntity> viewAllUsers() {
		
	  return service.getAllUsers();
		
	}
	
	@DeleteMapping("{adharNumber}")
	public String deleteUser(@PathVariable("adharNumber") long adharNumber) {
		
		return service.deleteUser(adharNumber);
	}
	
	@PutMapping("{adharNumber}")
	public UserEntity updateUser(@PathVariable("adharNumber") long adharNumber,@RequestBody UserEntity user) {
		
		user.setAadharNumber(adharNumber);
		return service.addUser(user);
	}
	
	@GetMapping("{adharNumber}")
	public Optional<UserEntity> getUserByAdharNumber(@PathVariable("adharNumber") long adharNumber) {
		
		return service.getUserByAadharNumber(adharNumber);
	}
	
	

}
