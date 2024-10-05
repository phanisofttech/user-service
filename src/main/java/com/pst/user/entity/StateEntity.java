package com.pst.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "state")
public class StateEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stateId;
	@Column(name = "state_name")
	private String stateName;
	@Column(name = "country_id")
	private int countryId;
	
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public StateEntity(int stateId, String stateName, int countryId) {
		this.stateId = stateId;
		this.stateName = stateName;
		this.countryId = countryId;
	}
	public StateEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
}
