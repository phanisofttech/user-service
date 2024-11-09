package com.pst.user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="certificate_requests")
public class RequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicationId;     //Primary Key

    //Identification and Personal Details
    private String fullName;
    private String aadhaarCardNumber;
    private String gender;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    //Family Details
    private String fatherName;
    private String motherName;

    //Address Details
    private String village;
    private String mandal;
    private String district;
    private String state;
    private String country;

    //Contact Details
    private String email;
    private String mobileNumber;
    private String rationCardNumber;

    //Application Details
    private String typeOfDocument;
    private String purposeOfCertificate;

    private Integer submittedDate;        //Only day number
    private String submittedMonth;
    private Integer submittedYear;

    //Additional Information
    private String designation;
    private Double yearlyIncome;
    private String typeOfHouse;
    private String physicallyHandicapped;       //Stores "YES" or "NO"
    private String governmentEmployee;      //Stores "YES" or "NO"

    private String caste;
    private String subCaste;

    @Temporal(TemporalType.DATE)
    private Date dateOfDeath;

    //Status and Comments
    private String status;
    private String comments;

    //Timestamps
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt = new Date();

}
