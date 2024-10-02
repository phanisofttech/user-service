package com.pst.user.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pst.user.entity.CountryEntity;
import com.pst.user.entity.DistrictEntity;
import com.pst.user.entity.MandalEntity;
import com.pst.user.entity.StateEntity;
import com.pst.user.entity.VillageEntity;
import com.pst.user.service.RevenueService;

@RestController
@RequestMapping("/revenue")
public class RevenueController {

	@Autowired
	RevenueService revenueService;
	
	@GetMapping("/countries")
	public List<CountryEntity> getCountries() {
		return revenueService.getAllCountries();
	}
	
	@GetMapping("/states")
	public List<StateEntity> getStates() {
		return revenueService.getAllStates();
	}
	
	@GetMapping("/districts")
	public List<DistrictEntity> getDistricts() {
		return revenueService.getAllDistricts();
	}
	
	@GetMapping("/districts/{stateId}")
	public List<DistrictEntity> getDistrictsByStateId(@PathVariable int stateId) {
		return revenueService.getDistictsInfoByStateId(stateId);
	}
	
	@GetMapping("/mandals")
	public List<MandalEntity> getMandals() {
		return revenueService.getAllMandals();
	}
	
	@GetMapping("/mandals/{districtId}")
	public List<MandalEntity> getMandalsByDistrictId(@PathVariable int districtId) {
		return revenueService.getMandalsInfoByDistrictId(districtId);
	}
	
	@GetMapping("/villages")
	public List<VillageEntity> getVillages() {
		return revenueService.getAllVillages();
	}
	
	@GetMapping("/villages/{mandalId}")
	public List<VillageEntity> getVillagesByMandalId(@PathVariable int mandalId) {
		return revenueService.getVillagesInfoByMandalId(mandalId);
	}
	
}
