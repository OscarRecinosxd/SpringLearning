package com.oscarrecinos.restapi.v2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class versioningPersonController {
    @GetMapping(value="/v1/person")
    public PersonV1 getFirstVersionPerson() {
        return new PersonV1("Oscar Recinos");
    }

    @GetMapping(value="/v2/person")
    public PersonV2 getSecondVersionPerson() {
        return new PersonV2("Oscar","Recinos");
    }
    
}
