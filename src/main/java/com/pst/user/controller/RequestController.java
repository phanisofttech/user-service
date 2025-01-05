package com.pst.user.controller;

import com.pst.user.entity.RequestEntity;
import com.pst.user.response.RequestResponse;
import com.pst.user.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/request")
@CrossOrigin(origins = "*")
public class RequestController {

    @Autowired
    private RequestService requestService;

    @PostMapping("/sendCertificateRequest")
    public RequestResponse createRequest(@RequestBody RequestEntity requestEntity){
        return requestService.saveRequest(requestEntity);
    }

}
