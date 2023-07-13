package com.oscarrecinos.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping("/hello-world")
    public String helloWorld(){
        return "hello world";
    }
    
    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldPath(@PathVariable String name){
        return new HelloWorldBean("Hello World " + name);
    }
    
}
