package com.pst.user.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pst.user.repository.RequestRepository;
import com.pst.user.response.FilterCertificateReportResponse;
import com.pst.user.response.FilterResourceAllocationResponse;

@Service
public class FilterService {

	@Autowired
	private RequestRepository requestRepository;

	public List<FilterResourceAllocationResponse> findCertificateBasedOnLocation(String country, String state,
			String district, String mandal, String village) {
		if (country != null && state != null && district != null && mandal != null && village != null) {
			List<Object[]> results = requestRepository.findByCountryAndStateAndDistrictAndMandalAndVillage(country,
					state, district, mandal, village);
			return mapToResourceAllocationResponse(results);
		} else if (country != null && state == null && district == null && mandal == null && village == null) {
			List<Object[]> results = requestRepository.findByCountry(country);
			return mapToResourceAllocationResponse(results);
		} else if (country != null && state != null && district == null && mandal == null && village == null) {
			List<Object[]> results = requestRepository.findByCountryAndState(country, state);
			return mapToResourceAllocationResponse(results);
		} else if (country != null && state != null && district != null && mandal == null && village == null) {
			List<Object[]> results = requestRepository.findByCountryAndStateAndDistrict(country, state, district);
			return mapToResourceAllocationResponse(results);
		} else if (country != null && state != null && district != null && mandal != null && village == null) {
			List<Object[]> results = requestRepository.findByCountryAndStateAndDistrictAndMandal(country, state,
					district, mandal);
			return mapToResourceAllocationResponse(results);
		}
		return Collections.emptyList();
	}

	public List<FilterCertificateReportResponse> findCertificatesBasedOnTime(Integer year, String month, Integer date) {

		if (year != null && month != null && date != null) {
			int numericMonth = Month.valueOf(month.toUpperCase()).getValue();
			LocalDate localDate = LocalDate.of(year, numericMonth, date);
			java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);
			List<Object[]> results = requestRepository.findByCreatedAt(sqlDate);
			return mapToCertificateReportResponse(results);
		} else if (year != null && month == null && date == null) {
			List<Object[]> results = requestRepository.findByCreatedAtYear(year);
			return mapToCertificateReportResponse(results);
		} else if (year != null && month != null && date == null) {
			int numericMonth = Month.valueOf(month.toUpperCase()).getValue();
			List<Object[]> results = requestRepository.findByCreatedAtYearAndCreatedAtMonth(year, numericMonth);
			return mapToCertificateReportResponse(results);
		}
		return Collections.emptyList();
	}

	private List<FilterCertificateReportResponse> mapToCertificateReportResponse(List<Object[]> results) {
		List<FilterCertificateReportResponse> filterCertificateReportResponsess = new ArrayList<>();
		for (Object[] row : results) {
			String month = (String) row[0];
			Long applicationsReceived = ((Number) row[1]).longValue();
			Long applicationsInprogress = ((Number) row[2]).longValue();
			Long applicationsApproved = ((Number) row[3]).longValue();
			Long applicationsRejected = ((Number) row[4]).longValue();
			filterCertificateReportResponsess.add(new FilterCertificateReportResponse(month, applicationsReceived,
					applicationsInprogress, applicationsApproved, applicationsRejected));
		}
		return filterCertificateReportResponsess;
	}

	private List<FilterResourceAllocationResponse> mapToResourceAllocationResponse(List<Object[]> results) {
		List<FilterResourceAllocationResponse> filterResourceAllocationResponses = new ArrayList<>();
		for (Object[] row : results) {
			String country = (String) row[0];
			String state = (String) row[1];
			String district = (String) row[2];
			String mandal = (String) row[3];
			String village = (String) row[4];
			Long applicationsReceived = ((Number) row[5]).longValue();
			Long applicationsInprogress = ((Number) row[6]).longValue();
			Long applicationsApproved = ((Number) row[7]).longValue();
			Long applicationsRejected = ((Number) row[8]).longValue();
			filterResourceAllocationResponses.add(new FilterResourceAllocationResponse(country, state, district, mandal,
					village, applicationsReceived, applicationsInprogress, applicationsApproved, applicationsRejected));
		}
		return filterResourceAllocationResponses;
	}
}
