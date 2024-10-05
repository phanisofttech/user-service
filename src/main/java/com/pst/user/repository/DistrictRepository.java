package com.pst.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pst.user.entity.DistrictEntity;

public interface DistrictRepository extends JpaRepository<DistrictEntity,Integer> {

	public List<DistrictEntity> findDistrictByStateId(int stateId);
}
