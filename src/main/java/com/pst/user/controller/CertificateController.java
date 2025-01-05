package com.pst.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pst.user.dto.CertificateCountDto;
import com.pst.user.service.CertificateService;

@RestController
@RequestMapping("api/user/certificate_status")
@CrossOrigin(origins = "*")
public class CertificateController {
	
	@Autowired
	CertificateService certificateService;
	
	@GetMapping
	public List<CertificateCountDto> getCountOfCertificates() {
		return certificateService.getCertificateCount();
	}

}
