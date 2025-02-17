package com.pst.user.response;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilterCertificateReportResponse {
	
	@JsonProperty private String month ;
	
	@JsonProperty private long applicationsRecevied;
	
	@JsonProperty private long applicationsInprogress;
	
	@JsonProperty private long applicationsApproved;
	
	@JsonProperty private long applicationsRejected;

}
