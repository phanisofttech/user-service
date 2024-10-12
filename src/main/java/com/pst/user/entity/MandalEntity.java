package com.pst.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mandal")
public class MandalEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mandalId;
	@Column(name = "mandal_name")
	private String mandalName;
	@Column(name = "district_id")
	private int districtId;

	public int getMandalId() {
		return mandalId;
	}

	public void setMandalId(int mandalId) {
		this.mandalId = mandalId;
	}

	public String getMandalName() {
		return mandalName;
	}

	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public MandalEntity(int mandalId, String mandalName, int districtId) {
		this.mandalId = mandalId;
		this.mandalName = mandalName;
		this.districtId = districtId;
	}

	public MandalEntity() {
		// TODO Auto-generated constructor stub
	}

}
