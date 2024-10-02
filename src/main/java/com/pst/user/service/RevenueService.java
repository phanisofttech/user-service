package com.pst.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pst.user.entity.CountryEntity;
import com.pst.user.entity.DistrictEntity;
import com.pst.user.entity.MandalEntity;
import com.pst.user.entity.StateEntity;
import com.pst.user.entity.VillageEntity;
import com.pst.user.repository.CountryRepo;
import com.pst.user.repository.DistrictRepo;
import com.pst.user.repository.MandalRepo;
import com.pst.user.repository.StateRepo;
import com.pst.user.repository.VillageRepo;

@Service
public class RevenueService {
	
	@Autowired
	CountryRepo countryRepo;
	
	@Autowired
	StateRepo stateRepo;
	
	@Autowired
	DistrictRepo districtRepo;
	
	@Autowired
	MandalRepo mandalRepo;
	
	@Autowired
	VillageRepo villageRepo;

	public List<CountryEntity> getAllCountries() {
		return countryRepo.findAll();
	}
	
	public List<StateEntity> getAllStates() {
		return stateRepo.findAll();
	}
	
	public List<DistrictEntity> getAllDistricts() {
		return districtRepo.findAll();
	}
	
	public List<DistrictEntity> getDistictsInfoByStateId(int stateId) {
		return districtRepo.findDistrictByStateId(stateId);
	}
	
	public List<MandalEntity> getAllMandals() {
		return mandalRepo.findAll();
	}
	
	public List<MandalEntity> getMandalsInfoByDistrictId(int districtId) {
		return mandalRepo.findMandalsByDistrictId(districtId);
	}
	
	public List<VillageEntity> getAllVillages() {
		return villageRepo.findAll();
	}
	
	public List<VillageEntity> getVillagesInfoByMandalId(int mandalId) {
		return villageRepo.findVillageByMandalId(mandalId);
	}
}
