package com.pst.user.service;

import com.pst.user.entity.RequestEntity;
import com.pst.user.repository.RequestRepository;
import com.pst.user.response.RequestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class FilterService {

	@Autowired
	private RequestRepository requestRepository;

	public List<RequestResponse> findCertificatesBasedOnLocations(String country, String state, String district,
			String mandal, String village) {
		if (country != null && state != null && district != null && mandal != null && village != null) {
			List<RequestEntity> requestEntities = requestRepository
					.findByCountryAndStateAndDistrictAndMandalAndVillage(country, state, district, mandal, village);
			return mapToResponse(requestEntities);
		} else if (country != null && state != null && district != null && mandal != null) {
			List<RequestEntity> requestEntities = requestRepository.findByCountryAndStateAndDistrictAndMandal(country,
					state, district, mandal);
			return mapToResponse(requestEntities);
		} else if (country != null && state != null && district != null) {
			List<RequestEntity> requestEntities = requestRepository.findByCountryAndStateAndDistrict(country, state,
					district);
			return mapToResponse(requestEntities);
		} else if (country != null && state != null) {
			System.out.println("cmg s");
			List<RequestEntity> requestEntities = requestRepository.findByCountryAndState(country, state);
			return mapToResponse(requestEntities);
		} else if (country != null) {
			List<RequestEntity> requestEntities = requestRepository.findByCountry(country);
			return mapToResponse(requestEntities);
		} else {
			// No parameters provided
			return Collections.emptyList();
		}

	}

	public List<RequestResponse> findCertificatesBasedOnTime(Integer year, String month, Integer date) {

		if (year != null && month != null && date != null) {
			int numericMonth = Month.valueOf(month.toUpperCase()).getValue();
			LocalDate localDate = LocalDate.of(year, numericMonth, date);
			java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);
			List<RequestEntity> requestEntities = requestRepository.findByCreatedAt(sqlDate);
			return mapToResponse(requestEntities);
		} else if (year != null && month == null && date == null) {
			List<RequestEntity> requestEntities = requestRepository.findByCreatedAtYear(year);
			return mapToResponse(requestEntities);
		} else if (year != null && month != null && date == null) {
			int numericMonth = Month.valueOf(month.toUpperCase()).getValue();
			List<RequestEntity> requestEntities = requestRepository.findByCreatedAtYearAndCreatedAtMonth(year,
					numericMonth);
			return mapToResponse(requestEntities);
		}
		return Collections.emptyList();
	}

	private List<RequestResponse> mapToResponse(List<RequestEntity> requestEntities) {

		List<RequestResponse> requestResponses = new ArrayList<>();

		for (RequestEntity requestEntityList : requestEntities) {

			RequestResponse requestResponse = new RequestResponse(requestEntityList.getApplicationId(),
					requestEntityList.getFullName(), requestEntityList.getAadhaarCardNumber(),
					requestEntityList.getGender(), requestEntityList.getDateOfBirth(),
					requestEntityList.getFatherName(), requestEntityList.getMotherName(),
					requestEntityList.getVillage(), requestEntityList.getMandal(), requestEntityList.getDistrict(),
					requestEntityList.getState(), requestEntityList.getCountry(), requestEntityList.getEmail(),
					requestEntityList.getMobileNumber(), requestEntityList.getRationCardNumber(),
					requestEntityList.getTypeOfDocument(), requestEntityList.getPurposeOfCertificate(),
					requestEntityList.getSubmittedDate(), requestEntityList.getSubmittedMonth(),
					requestEntityList.getSubmittedYear(), requestEntityList.getDesignation(),
					requestEntityList.getYearlyIncome(), requestEntityList.getTypeOfHouse(),
					requestEntityList.getPhysicallyHandicapped(), requestEntityList.getGovernmentEmployee(),
					requestEntityList.getCaste(), requestEntityList.getSubCaste(), requestEntityList.getDateOfDeath(),
					requestEntityList.getStatus(), requestEntityList.getComments(), requestEntityList.getCreatedAt(),
					requestEntityList.getUpdatedAt());

			requestResponses.add(requestResponse);

		}
		return requestResponses;

	}
}
