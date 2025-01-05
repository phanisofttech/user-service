package com.pst.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pst.user.dto.CertificateCountDto;
import com.pst.user.repository.RequestRepository;

@Service
public class CertificateService {

	@Autowired
	private RequestRepository requestRepository;

	private static final String INPROGRESS = "Inprogress";
	private static final String COMPLETED = "Completed";
	private static final String REJECTED = "Rejected";
	private static final String[] certificateNames = { "Caste", "Income", "Birth", "Death" };

	public List<CertificateCountDto> getCertificateCount() {

		List<CertificateCountDto> certificateCountDtos = new ArrayList<CertificateCountDto>();

		List<Object[]> totalCertificateCountList = requestRepository.findCertificateTypeCount();
		List<Object[]> inProgressCertificateCountList = requestRepository.findCertificateTypeCountByStatus(INPROGRESS);
		List<Object[]> completedCertificateCountList = requestRepository.findCertificateTypeCountByStatus(COMPLETED);
		List<Object[]> rejectedCertificateCountList = requestRepository.findCertificateTypeCountByStatus(REJECTED);

		for (String certificateName : certificateNames) {
			long totalCertificateCount = getCertificateCounts(totalCertificateCountList, certificateName);
			long inProgressCertificateCount = getCertificateCounts(inProgressCertificateCountList, certificateName);
			long completedCertificateCount = getCertificateCounts(completedCertificateCountList, certificateName);
			long rejectedCertificateCount = getCertificateCounts(rejectedCertificateCountList, certificateName);

			CertificateCountDto certificateCountDto = new CertificateCountDto(certificateName, totalCertificateCount,
					inProgressCertificateCount, completedCertificateCount, rejectedCertificateCount);
			certificateCountDtos.add(certificateCountDto);
		}
		return certificateCountDtos;

	}

	private long getCertificateCounts(List<Object[]> certificateCountList, String certificateType) {
		for (Object[] objects : certificateCountList) {
			String certificate = objects[0].toString();
			if (certificate.equals(certificateType)) {
				return (long) objects[1];
			}
		}
		return 0;
	}

}
