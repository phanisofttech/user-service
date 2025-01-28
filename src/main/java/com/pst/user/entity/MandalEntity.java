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
@Table(name = "mandal")
public class MandalEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mandalId;
	@Column(name = "mandal_name")
	private String mandalName;
	@Column(name = "district_id")
	private int districtId;

}
