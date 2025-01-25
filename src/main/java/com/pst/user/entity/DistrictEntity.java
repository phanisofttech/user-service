package com.pst.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
