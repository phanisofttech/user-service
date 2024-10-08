package com.pst.user.entity;

import java.sql.Blob;
import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {
	@Id
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

	public long getAaadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadhaarNumber = aadharNumber;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public UserEntity() {
		// empty
	}

	public UserEntity(long aadhaarNumber, String userFirstName, String userLastName, String gender, Date dateOfBirth,
			long mobileNumber, String email, String addressLine1, String village, String mandal, String district,
			int pin, String state, String country, int otp, String password, Blob photo, String createdBy,
			String updatedBy, Date createdAt, Date updatedAt) {
		this.aadhaarNumber = aadhaarNumber;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.addressLine1 = addressLine1;
		this.village = village;
		this.mandal = mandal;
		this.district = district;
		this.pin = pin;
		this.state = state;
		this.country = country;
		this.otp = otp;
		this.password = password;
		this.photo = photo;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
}
