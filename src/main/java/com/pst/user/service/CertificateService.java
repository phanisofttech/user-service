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

	public List<CertificateCountDto> getCertificateCount() {

		List<CertificateCountDto> certificateCountDtos = new ArrayList<CertificateCountDto>();
		String[] certificateNames = { "Caste", "Income", "Birth", "Death" };

		List<Object[]> totalCertificateCountList = requestRepository.findCertificateTypeCount();
		List<Object[]> newCertificateCountList = requestRepository.findCertificateTypeCountByStatus("new");
		List<Object[]> inProgressCertificateCountList = requestRepository.findCertificateTypeCountByStatus("inprogress");
		List<Object[]> completedCertificateCountList = requestRepository.findCertificateTypeCountByStatus("completed");
		List<Object[]> rejectedCertificateCountList = requestRepository.findCertificateTypeCountByStatus("rejected");

		for (String certificateName : certificateNames) {
			long totalCertificateCount = getCertificateCounts(totalCertificateCountList, certificateName);
			long newCertificateCount = getCertificateCounts(newCertificateCountList, certificateName);
			long inProgressCertificateCount = getCertificateCounts(inProgressCertificateCountList, certificateName);
			long completedCertificateCount = getCertificateCounts(completedCertificateCountList, certificateName);
			long rejectedCertificateCount = getCertificateCounts(rejectedCertificateCountList, certificateName);

			CertificateCountDto certificateCountDto = new CertificateCountDto(certificateName, totalCertificateCount,
					newCertificateCount, inProgressCertificateCount, completedCertificateCount,
					rejectedCertificateCount);
			certificateCountDtos.add(certificateCountDto);
		}
		return certificateCountDtos;

	}

	private long getCertificateCounts(List<Object[]> certificateCountList, String certificateType) {
		for (Object[] objects : certificateCountList) {
			String certificate = objects[0].toString();
			if (certificate.equals(certificateType)) {
				/*long count = (long)*/return (long) objects[1];
				/*return count;*/
			}
		}
		return 0;
	}

}
