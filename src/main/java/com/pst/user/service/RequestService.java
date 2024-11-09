package com.pst.user.service;

import com.pst.user.entity.RequestEntity;
import com.pst.user.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public RequestEntity saveRequest(RequestEntity requestEntity){
        requestEntity.setCreatedAt(new Date());
        requestEntity.setUpdatedAt(new Date());
        return requestRepository.save(requestEntity);
    }
}
