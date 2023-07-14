package com.oscarrecinos.restapi.v2.controller;

public class PersonV1 {
    private String name;

    public PersonV1(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
