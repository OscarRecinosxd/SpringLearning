package com.oscarrecinos.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oscarrecinos.limitsservice.bean.Limits;
import com.oscarrecinos.limitsservice.configuration.Configuration;

@RestController
public class LimitsController {
    @Autowired
    private Configuration configuration;


    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMinimun(), configuration.getMaximun());
    }
}
