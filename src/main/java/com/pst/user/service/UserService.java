package com.pst.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pst.user.entity.UserEntity;
import com.pst.user.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo repositary;
	
	public List<UserEntity> getAllUsers() {
		
		return repositary.findAll();
		
	}
	
	public UserEntity addUser(UserEntity user) {
		
		return repositary.save(user);
	}
	
	public String deleteUser(long adharNumber) {
		
		repositary.deleteById(adharNumber);
		return "deleted";
	}
    
	public Optional<UserEntity> getUserByAadharNumber(long adharNumber) {
		
		return repositary.findById(adharNumber);
	}
}
