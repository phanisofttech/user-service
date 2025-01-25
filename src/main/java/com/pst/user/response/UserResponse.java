package com.pst.user.response;

import java.sql.Blob;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
	private long aadhaarNumber;

	private String userFirstName;

	private String userLastName;

	private String gender;

	private Date dateOfBirth;

	private long mobileNumber;

	private String email;

	private String addressLine1;

	private String village;

	private String mandal;

	private String district;

	private int pin;

	private String state;

	private String country;

	private int otp;

	private String password;

	private Blob photo;

	private String createdBy;

	private String updatedBy;

	private Date createdAt;

	private Date updatedAt;

}
