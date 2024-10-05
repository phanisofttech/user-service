package com.pst.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pst.user.entity.VillageEntity;

public interface VillageRepository extends JpaRepository<VillageEntity, Integer>{

	public List<VillageEntity> findVillageByMandalId(int mandalId);
}
