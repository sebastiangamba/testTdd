package com.example.testTdd.controller;

import com.example.testTdd.service.IHelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

    private IHelloWorldService helloWorldService;

    @Autowired
    public HelloWorldController(IHelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld(String name) {
        return helloWorldService.returnHelloMessage();
    }
}
