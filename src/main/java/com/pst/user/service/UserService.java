package com.pst.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pst.user.entity.UserEntity;
import com.pst.user.repository.UserRepository;
import com.pst.user.request.ChangePasswordRequest;
import com.pst.user.response.ChangePasswordResponse;
import com.pst.user.response.UserResponse;

import jakarta.transaction.Transactional;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepositary;

	private UserResponse userResponse = new UserResponse();

	private ChangePasswordResponse changePasswordResponse = new ChangePasswordResponse();

	public List<UserResponse> getAllUsers() {
		List<UserEntity> userEntities = userRepositary.findAll();
		List<UserResponse> userResponses = new ArrayList<UserResponse>();
		for (UserEntity userEntity : userEntities) {
			userResponse = new UserResponse();
			userResponse.setAadhaarNumber(userEntity.getAadhaarNumber());
			userResponse.setUserFirstName(userEntity.getUserFirstName());
			userResponse.setUserLastName(userEntity.getUserLastName());
			userResponse.setGender(userEntity.getGender());
			userResponse.setDateOfBirth(userEntity.getDateOfBirth());
			userResponse.setMobileNumber(userEntity.getMobileNumber());
			userResponse.setEmail(userEntity.getEmail());
			userResponse.setAddressLine1(userEntity.getAddressLine1());
			userResponse.setVillage(userEntity.getVillage());
			userResponse.setMandal(userEntity.getMandal());
			userResponse.setDistrict(userEntity.getDistrict());
			userResponse.setPin(userEntity.getPin());
			userResponse.setState(userEntity.getState());
			userResponse.setCountry(userEntity.getCountry());
			userResponse.setOtp(userEntity.getOtp());
			userResponse.setPassword(userEntity.getPassword());
			userResponse.setPhoto(userEntity.getPhoto());
			userResponse.setCreatedBy(userEntity.getCreatedBy());
			userResponse.setUpdatedBy(userEntity.getUpdatedBy());
			userResponse.setCreatedAt(userEntity.getCreatedAt());
			userResponse.setUpdatedAt(userEntity.getUpdatedAt());

			userResponses.add(userResponse);
		}
		return userResponses;
	}

	public UserResponse addUser(UserEntity user) {
		UserEntity userEntity = userRepositary.save(user);
		userResponse.setAadhaarNumber(userEntity.getAadhaarNumber());
		userResponse.setUserFirstName(userEntity.getUserFirstName());
		userResponse.setUserLastName(userEntity.getUserLastName());
		userResponse.setGender(userEntity.getGender());
		userResponse.setDateOfBirth(userEntity.getDateOfBirth());
		userResponse.setMobileNumber(userEntity.getMobileNumber());
		userResponse.setEmail(userEntity.getEmail());
		userResponse.setAddressLine1(userEntity.getAddressLine1());
		userResponse.setVillage(userEntity.getVillage());
		userResponse.setMandal(userEntity.getMandal());
		userResponse.setDistrict(userEntity.getDistrict());
		userResponse.setPin(userEntity.getPin());
		userResponse.setState(userEntity.getState());
		userResponse.setCountry(userEntity.getCountry());
		userResponse.setOtp(userEntity.getOtp());
		userResponse.setPassword(userEntity.getPassword());
		userResponse.setPhoto(userEntity.getPhoto());
		userResponse.setCreatedBy(userEntity.getCreatedBy());
		userResponse.setUpdatedBy(userEntity.getUpdatedBy());
		userResponse.setCreatedAt(userEntity.getCreatedAt());
		userResponse.setUpdatedAt(userEntity.getUpdatedAt());

		return userResponse;
	}

	public String deleteUser(long aadhaarNumber) {
		userRepositary.deleteById(aadhaarNumber);
		return "User with Aadhaar Number " + aadhaarNumber + " has been deleted";
	}

	public UserResponse getUserByAadhaarNumber(long aadhaarNumber) {
		Optional<UserEntity> userOptional = userRepositary.findById(aadhaarNumber);
		if (userOptional.isPresent()) {
			UserEntity userEntity = userOptional.get();

			userResponse.setAadhaarNumber(userEntity.getAadhaarNumber());
			userResponse.setUserFirstName(userEntity.getUserFirstName());
			userResponse.setUserLastName(userEntity.getUserLastName());
			userResponse.setGender(userEntity.getGender());
			userResponse.setDateOfBirth(userEntity.getDateOfBirth());
			userResponse.setMobileNumber(userEntity.getMobileNumber());
			userResponse.setEmail(userEntity.getEmail());
			userResponse.setAddressLine1(userEntity.getAddressLine1());
			userResponse.setVillage(userEntity.getVillage());
			userResponse.setMandal(userEntity.getMandal());
			userResponse.setDistrict(userEntity.getDistrict());
			userResponse.setPin(userEntity.getPin());
			userResponse.setState(userEntity.getState());
			userResponse.setCountry(userEntity.getCountry());
			userResponse.setOtp(userEntity.getOtp());
			userResponse.setPassword(userEntity.getPassword());
			userResponse.setPhoto(userEntity.getPhoto());
			userResponse.setCreatedBy(userEntity.getCreatedBy());
			userResponse.setUpdatedBy(userEntity.getUpdatedBy());
			userResponse.setCreatedAt(userEntity.getCreatedAt());
			userResponse.setUpdatedAt(userEntity.getUpdatedAt());

			return userResponse;

		} else {
			return null;
		}
	}

	@Transactional
	public ChangePasswordResponse updatePassword(ChangePasswordRequest changePasswordRequest) {
		UserResponse userResponse = getUserByAadhaarNumber(changePasswordRequest.getAadhaarNumber());
		if (userResponse != null) {
			if (userResponse.getPassword().equals(changePasswordRequest.getOldPassword())) {
				int rowsUpdated = userRepositary.updatePasswordByAadhaarNumber(changePasswordRequest.getNewPassword(),
						changePasswordRequest.getAadhaarNumber(), changePasswordRequest.getOldPassword());
				if (rowsUpdated > 0) {
					changePasswordResponse.setMessage("Password changed successfully.");
				} else {
					changePasswordResponse.setMessage("Password update failed. Please check the details.");
				}
			} else {
				changePasswordResponse.setMessage("Old password does not match");
			}
		} else {
			changePasswordResponse
					.setMessage("User not found");
		}
		return changePasswordResponse;
	}
}
