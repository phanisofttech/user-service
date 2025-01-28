package com.pst.user.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChangePasswordRequest {


    @JsonProperty
    private long aadhaarNumber;

    @JsonProperty private String oldPassword;

    @JsonProperty private String newPassword;
}
