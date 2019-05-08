package com.example.testTdd.service.impl;

import com.example.testTdd.service.IHelloWorldService;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceImpl implements IHelloWorldService {


    private String message = "Hello world";

    @Override
    public String returnHelloMessage(String name) {
        return message + " " + name;
    }
}
