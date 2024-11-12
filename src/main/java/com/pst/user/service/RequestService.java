package com.pst.user.service;

import com.pst.user.entity.RequestEntity;
import com.pst.user.repository.RequestRepository;
import com.pst.user.response.RequestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public RequestResponse saveRequest(RequestEntity requestEntity){
        requestEntity.setCreatedAt(new Date());
        requestEntity.setUpdatedAt(new Date());
        RequestEntity savedEntity = requestRepository.save(requestEntity);
        return mapToRequestResponse(savedEntity);
    }

    private RequestResponse mapToRequestResponse(RequestEntity entity){
       return new RequestResponse(
                entity.getApplicationId(),
                entity.getFullName(),
                entity.getAadhaarCardNumber(),
                entity.getGender(),
                entity.getDateOfBirth(),
                entity.getFatherName(),
                entity.getMotherName(),
                entity.getVillage(),
                entity.getMandal(),
                entity.getDistrict(),
                entity.getState(),
                entity.getCountry(),
                entity.getEmail(),
                entity.getMobileNumber(),
                entity.getRationCardNumber(),
                entity.getTypeOfDocument(),
                entity.getPurposeOfCertificate(),
                entity.getSubmittedDate(),
                entity.getSubmittedMonth(),
                entity.getSubmittedYear(),
                entity.getDesignation(),
                entity.getYearlyIncome(),
                entity.getTypeOfHouse(),
                entity.getPhysicallyHandicapped(),
                entity.getGovernmentEmployee(),
                entity.getCaste(),
                entity.getSubCaste(),
                entity.getDateOfDeath(),
                entity.getStatus(),
                entity.getComments(),
                entity.getCreatedAt(),
                entity.getUpdatedAt()
        );
    }

}
