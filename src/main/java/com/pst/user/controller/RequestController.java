package com.pst.user.controller;

import com.pst.user.entity.RequestEntity;
import com.pst.user.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/request")
public class RequestController {

    @Autowired
    private RequestService requestService;

    @PostMapping("/sendCertificateRequest")
    public RequestEntity createRequest(@RequestBody RequestEntity requestEntity){
        return requestService.saveRequest(requestEntity);
    }

}
