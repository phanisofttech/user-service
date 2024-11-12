package com.pst.user.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestResponse {

    private Long applicationId;

    // Identification and Personal Details
    private String fullName;
    private String aadhaarCardNumber;
    private String gender;
    private Date dateOfBirth;

    // Family Details
    private String fatherName;
    private String motherName;

    // Address Details
    private String village;
    private String mandal;
    private String district;
    private String state;
    private String country;

    // Contact Details
    private String email;
    private String mobileNumber;
    private String rationCardNumber;

    // Application Details
    private String typeOfDocument;
    private String purposeOfCertificate;
    private Integer submittedDate;
    private String submittedMonth;
    private Integer submittedYear;

    // Additional Information
    private String designation;
    private Double yearlyIncome;
    private String typeOfHouse;
    private String physicallyHandicapped;
    private String governmentEmployee;
    private String caste;
    private String subCaste;
    private Date dateOfDeath;

    // Status and Comments
    private String status;
    private String comments;

    // Timestamps
    private Date createdAt;
    private Date updatedAt;


}
