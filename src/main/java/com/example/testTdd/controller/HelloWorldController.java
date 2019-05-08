package com.example.testTdd.controller;

import com.example.testTdd.service.IHelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorldController {

    private IHelloWorldService helloWorldService;

    @Autowired
    public HelloWorldController(IHelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String helloWorld() {
        return helloWorldService.returnHelloMessage();
    }
}
