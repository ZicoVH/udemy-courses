package com.zicoexample.helloworldservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping(value = "/hello")
    public String sayHello(){
        return "Hello, Welcome to the course on Microservices";
    }
}
