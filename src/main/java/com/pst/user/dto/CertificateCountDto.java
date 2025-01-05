package com.pst.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CertificateCountDto {
	
	public String certificateType;
	
	public long totalCount;
	
	public long inProgressCertificateCount;
	
	public long completedCertificateCount;
	
	public long rejectedCertificateCount;

}
