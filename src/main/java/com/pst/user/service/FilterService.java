package com.pst.user.service;

import com.pst.user.entity.RequestEntity;
import com.pst.user.repository.RequestRepository;
import com.pst.user.response.RequestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class FilterService {

    @Autowired
    private RequestRepository requestRepository;

    public List<RequestResponse> findCertificatesBasedOnTime(Integer year, Integer month, Integer date) {

        if (year != null && month != null && date != null) {
            LocalDate localDate = LocalDate.of(year, month, date);
            java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);
            List<RequestEntity> requestEntities = requestRepository.findByCreatedAt(sqlDate);
            return mapToResponse(requestEntities);
        } else if (year != null && month == null && date == null) {
            List<RequestEntity> requestEntities =  requestRepository.findByCreatedAtYear(year);
            return mapToResponse(requestEntities);
        } else if (year != null && month != null && date == null) {
            List<RequestEntity> requestEntities =  requestRepository.findByCreatedAtYearAndCreatedAtMonth(year, month);
            return mapToResponse(requestEntities);
        }
        return Collections.emptyList();
    }

    private List<RequestResponse> mapToResponse(List<RequestEntity> requestEntities){

        List<RequestResponse> requestResponses = new ArrayList<>();

        for(RequestEntity requestEntityList : requestEntities){

            RequestResponse requestResponse = new RequestResponse(requestEntityList.getApplicationId(),
                    requestEntityList.getFullName(),
                    requestEntityList.getAadhaarCardNumber(),
                    requestEntityList.getGender(),
                    requestEntityList.getDateOfBirth(),
                    requestEntityList.getFatherName(),
                    requestEntityList.getMotherName(),
                    requestEntityList.getVillage(),
                    requestEntityList.getMandal(),
                    requestEntityList.getDistrict(),
                    requestEntityList.getState(),
                    requestEntityList.getCountry(),
                    requestEntityList.getEmail(),
                    requestEntityList.getMobileNumber(),
                    requestEntityList.getRationCardNumber(),
                    requestEntityList.getTypeOfDocument(),
                    requestEntityList.getPurposeOfCertificate(),
                    requestEntityList.getSubmittedDate(),
                    requestEntityList.getSubmittedMonth(),
                    requestEntityList.getSubmittedYear(),
                    requestEntityList.getDesignation(),
                    requestEntityList.getYearlyIncome(),
                    requestEntityList.getTypeOfHouse(),
                    requestEntityList.getPhysicallyHandicapped(),
                    requestEntityList.getGovernmentEmployee(),
                    requestEntityList.getCaste(),
                    requestEntityList.getSubCaste(),
                    requestEntityList.getDateOfDeath(),
                    requestEntityList.getStatus(),
                    requestEntityList.getComments(),
                    requestEntityList.getCreatedAt(),
                    requestEntityList.getUpdatedAt());

            requestResponses.add(requestResponse);

        }
        return requestResponses;

    }
}
