package com.pst.user.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilterResourceAllocationResponse {

	@JsonProperty private String country ;
	
	@JsonProperty private String state ;
	
	@JsonProperty private String district ;
	
	@JsonProperty private String mandal ;
	
	@JsonProperty private String village ;
	
    @JsonProperty private long applicationsRecevied;
	
	@JsonProperty private long applicationsInprogress;
	
	@JsonProperty private long applicationsApproved;
	
	@JsonProperty private long applicationsRejected; 
}
