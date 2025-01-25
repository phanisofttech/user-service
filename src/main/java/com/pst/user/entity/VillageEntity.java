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
@Table(name = "village")
public class VillageEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int villageId;
	@Column(name = "village_name")
	private String villageName;
	@Column(name = "mandal_id")
	private int mandalId;

}
