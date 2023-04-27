package com.oscarrecinos.learnsprinboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CourseConfigurationController {
    @Autowired
    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/configuration")
    public CurrencyServiceConfiguration retrieveAllCourses(){
        return configuration;
    }
}
