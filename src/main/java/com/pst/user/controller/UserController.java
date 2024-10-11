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
import com.pst.user.response.UserResponse;
import com.pst.user.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("add-users")
	public UserResponse addUser(@RequestBody UserEntity user) {
		return service.addUser(user);
	}

	@GetMapping("/view-all-users")
	public List<UserResponse> viewAllUsers() {
		return service.getAllUsers();
	}

	@DeleteMapping("delete-user/{aadhaarNumber}")
	public String deleteUser(@PathVariable("aadhaarNumber") long aadhaarNumber) {
		return service.deleteUser(aadhaarNumber);
	}

	@PutMapping("update-user/{aadhaarNumber}")
	public UserResponse updateUser(@PathVariable("aadhaarNumber") long aadhaarNumber, @RequestBody UserEntity user) {
		user.setAadhaarNumber(aadhaarNumber);
		return service.addUser(user);
	}

	@GetMapping("get-user/{aadhaarNumber}")
	public UserResponse getUserByAdhaarNumber(@PathVariable("aadhaarNumber") long aadhaarNumber) {
		return service.getUserByAadhaarNumber(aadhaarNumber);
	}
}
