package com.pst.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "village")
public class VillageEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int villageId;
	
	private String villageName;
	
	private int mandalId;

	public int getVillageId() {
		return villageId;
	}

	public void setVillageId(int villageId) {
		this.villageId = villageId;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public int getMandalId() {
		return mandalId;
	}

	public void setMandalId(int mandalId) {
		this.mandalId = mandalId;
	}

	public VillageEntity(int villageId, String villageName, int mandalId) {
		this.villageId = villageId;
		this.villageName = villageName;
		this.mandalId = mandalId;
	}

	public VillageEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
}
