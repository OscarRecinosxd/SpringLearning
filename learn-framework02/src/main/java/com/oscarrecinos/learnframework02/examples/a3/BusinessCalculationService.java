package com.oscarrecinos.learnframework02.examples.a3;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;



@Configuration
public class BusinessCalculationService {
    public DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }


    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

}
