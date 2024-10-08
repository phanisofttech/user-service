package com.pst.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pst.user.entity.CountryEntity;
import com.pst.user.entity.DistrictEntity;
import com.pst.user.entity.MandalEntity;
import com.pst.user.entity.StateEntity;
import com.pst.user.entity.VillageEntity;
import com.pst.user.repository.CountryRepository;
import com.pst.user.repository.DistrictRepository;
import com.pst.user.repository.MandalRepository;
import com.pst.user.repository.StateRepository;
import com.pst.user.repository.VillageRepository;

@Service
public class RevenueService {
	
	@Autowired
	CountryRepository countryRepository;
	
	@Autowired
	StateRepository stateRepository;
	
	@Autowired
	DistrictRepository districtRepository;
	
	@Autowired
	MandalRepository mandalRepository;
	
	@Autowired
	VillageRepository villageRepository;

	public List<CountryEntity> getAllCountries() {
		return countryRepository.findAll();
	}
	
	public List<StateEntity> getAllStates() {
		return stateRepository.findAll();
	}
	
	public List<DistrictEntity> getAllDistricts() {
		return districtRepository.findAll();
	}
	
	public List<DistrictEntity> getDistictsInfoByStateId(int stateId) {
		return districtRepository.findDistrictByStateId(stateId);
	}
	
	public List<MandalEntity> getAllMandals() {
		return mandalRepository.findAll();
	}
	
	public List<MandalEntity> getMandalsInfoByDistrictId(int districtId) {
		return mandalRepository.findMandalsByDistrictId(districtId);
	}
	
	public List<VillageEntity> getAllVillages() {
		return villageRepository.findAll();
	}
	
	public List<VillageEntity> getVillagesInfoByMandalId(int mandalId) {
		return villageRepository.findVillageByMandalId(mandalId);
	}
}
