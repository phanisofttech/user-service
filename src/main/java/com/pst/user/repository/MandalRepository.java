package com.pst.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pst.user.entity.MandalEntity;

public interface MandalRepository extends JpaRepository<MandalEntity, Integer> {

	public List<MandalEntity> findMandalsByDistrictId(int districtId);
}
