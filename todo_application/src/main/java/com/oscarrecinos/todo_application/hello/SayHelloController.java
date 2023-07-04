package com.oscarrecinos.todo_application.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {


    @GetMapping("/say-hello")
    @ResponseBody
    public String sayHello(){

        return "helloworld"; 
    }

    @GetMapping("/say-hello-html")
    public String sayHelloHtml(){
        return "helloworld"; 
    }

    @RequestMapping("/say-hello-jsp")
    public String sayHelloJSP(){
        return "sayHello"; 
    }
    
    
}
