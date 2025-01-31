package com.pst.user.controller;

import com.pst.user.response.RequestResponse;
import com.pst.user.service.FilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This class is used to filter the certificates based on the year, month, date
 */
@RestController
@RequestMapping("/api")
public class FilterController {

    @Autowired
    private FilterService filterService;

    @GetMapping({ "/filter-certificate/{year}", "/filter-certificate/{year}/{month}",
            "/filter-certificate/{year}/{month}/{date}" })
    public List<RequestResponse> doFilterBasedOnTime(@PathVariable(required = false) Integer year,
                                                     @PathVariable(required = false) Integer month, @PathVariable(required = false) Integer date) {
        return filterService.findCertificatesBasedOnTime(year, month, date);
    }
}
