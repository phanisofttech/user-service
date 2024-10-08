package com.pst.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "district")
public class DistrictEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int districtId;
	@Column(name = "district_name")
	private String districtName;
	@Column(name = "state_id")
	private int stateId;

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public DistrictEntity(int districtId, String districtName, int stateId) {
		this.districtId = districtId;
		this.districtName = districtName;
		this.stateId = stateId;
	}

	public DistrictEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
}
