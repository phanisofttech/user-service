package com.pst.user.controller;

import java.util.List;

import com.pst.user.request.ChangePasswordRequest;
import com.pst.user.response.ChangePasswordResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/add-user")
	public UserResponse addUser(@RequestBody UserEntity user) {
		return userService.addUser(user);
	}

	@GetMapping("/all-users")
	public List<UserResponse> viewAllUsers() {
		return userService.getAllUsers();
	}

	@DeleteMapping("/delete-user/{aadhaarNumber}")
	public String deleteUser(@PathVariable long aadhaarNumber) {
		return userService.deleteUser(aadhaarNumber);
	}

	@PutMapping("/update-user/{aadhaarNumber}")
	public UserResponse updateUser(@PathVariable long aadhaarNumber, @RequestBody UserEntity user) {
		user.setAadhaarNumber(aadhaarNumber);
		return userService.addUser(user);
	}

	@GetMapping("/{aadhaarNumber}")
	public UserResponse getUserByAadhaarNumber(@PathVariable long aadhaarNumber) {
		return userService.getUserByAadhaarNumber(aadhaarNumber);
	}

	@PostMapping("/change-password")
	public ChangePasswordResponse changePassword(@RequestBody ChangePasswordRequest changePasswordRequest) {
		return userService.updatePassword(changePasswordRequest);
	}
}
