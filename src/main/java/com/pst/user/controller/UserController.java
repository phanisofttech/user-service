package com.pst.user.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
	
	@GetMapping("/hello")
	public String hello() {
		System.out.println("hello calling...");
		return "hello";
	}
	
	@PostMapping
	public void addUser() {
		
	}
	
	@GetMapping
	public void viewAllUsers() {
		
	}
	
	@DeleteMapping("{adharNumber}")
	public void deleteUser(@PathVariable("adharNumber") long adharNumber) {
		
	}
	
	@PutMapping("{adharNumber}")
	public void updateUser(@PathVariable("adharNumber") long adharNumber) {
		
	}
	
	@GetMapping("{adharNumber}")
	public void getUserByAdharNumber(@PathVariable("adharNumber") long adharNumber) {
		
	}
	
	

}
