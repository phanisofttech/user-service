package com.pst.user.controller;

import java.util.List;

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
import com.pst.user.response.UserResponse;
import com.pst.user.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/add-user")
	public UserResponse addUser(@RequestBody UserEntity user) {
		return service.addUser(user);
	}

	@GetMapping("/all-users")
	public List<UserResponse> viewAllUsers() {
		return service.getAllUsers();
	}

	@DeleteMapping("/delete-user/{aadhaarNumber}")
	public String deleteUser(@PathVariable long aadhaarNumber) {
		return service.deleteUser(aadhaarNumber);
	}

	@PutMapping("/update-user/{aadhaarNumber}")
	public UserResponse updateUser(@PathVariable long aadhaarNumber, @RequestBody UserEntity user) {
		user.setAadhaarNumber(aadhaarNumber);
		return service.addUser(user);
	}

	@GetMapping("/{aadhaarNumber}")
	public UserResponse getUserByAadhaarNumber(@PathVariable long aadhaarNumber) {
		return service.getUserByAadhaarNumber(aadhaarNumber);
	}
}
