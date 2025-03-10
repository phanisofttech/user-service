package com.pst.user.controller;

import com.pst.user.response.FilterCertificateReportResponse;
import com.pst.user.response.FilterResourceAllocationResponse;
import com.pst.user.service.FilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * This class is used to filter the certificates based on the year, month, date
 * and also filter based on country, state, district, mandal, village
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class FilterController {

	@Autowired
	private FilterService filterService;

	/**
	 * This method is used to filter the certificates based on the year, month, date
	 */
	@GetMapping({ "/filter-certificate-time/{year}", "/filter-certificate-time/{year}/{month}",
			"/filter-certificate-time/{year}/{month}/{date}" })
	public List<FilterCertificateReportResponse> doFilterBasedOnTime(@PathVariable(required = false) Integer year,
			@PathVariable(required = false) String month, @PathVariable(required = false) Integer date) {
		return filterService.findCertificatesBasedOnTime(year, month, date);
	}

	@GetMapping({ "/filter-certificate-location/{country}", "/filter-certificate-location/{country}/{state}",
			"/filter-certificate-location/{country}/{state}/{district}",
			"/filter-certificate-location/{country}/{state}/{district}/{mandal}",
			"/filter-certificate-location/{country}/{state}/{district}/{mandal}/{village}" })
	public List<FilterResourceAllocationResponse> doFilterBasedOnLocation(
			@PathVariable(required = false) String country, @PathVariable(required = false) String state,
			@PathVariable(required = false) String district, @PathVariable(required = false) String mandal,
			@PathVariable(required = false) String village) {
		return filterService.findCertificateBasedOnLocation(country, state,district, mandal, village);
	}

}
