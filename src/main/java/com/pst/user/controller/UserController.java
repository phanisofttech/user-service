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
	public UserEntity addUser(@RequestBody UserEntity user) {
		return service.addUser(user);
	}

	@GetMapping("/all-users")
	public List<UserEntity> viewAllUsers() {
		return service.getAllUsers();
	}

	@DeleteMapping("{aadhaarNumber}")
	public String deleteUser(@PathVariable("aadhaarNumber") long aadhaarNumber) {
		return service.deleteUser(aadhaarNumber);
	}

	@PutMapping("{aadhaarNumber}")
	public UserEntity updateUser(@PathVariable("aadhaarNumber") long aadhaarNumber, @RequestBody UserEntity user) {
		user.setAadharNumber(aadhaarNumber);
		return service.addUser(user);
	}

	@GetMapping("{aadhaarNumber}")
	public Optional<UserEntity> getUserByAdharNumber(@PathVariable("aadhaarNumber") long aadhaarNumber) {
		return service.getUserByAadharNumber(aadhaarNumber);
	}
}
