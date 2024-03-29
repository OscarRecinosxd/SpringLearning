package com.oscarrecinos.mockito_testing.service;

import org.springframework.beans.factory.annotation.Autowired;

public class SomeBusinessImpl {

    @Autowired
    private DataService dataService;

    /*public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }*/

    public int findTheGreatestFromAllData(){
        int[] data = dataService.retrieveAllData();
        int greatestValue = Integer.MIN_VALUE;
        for (int value : data) {
            if(value > greatestValue)
                greatestValue = value;
        }
        return greatestValue;
    }
}
