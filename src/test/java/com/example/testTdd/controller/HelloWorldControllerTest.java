package com.example.testTdd.controller;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldControllerTest {

    /**
     * subject under testing
     */
    private HelloWorldController subject;


    @Before
    public void setUp() throws Exception {

        subject= new HelloWorldController();
    }

    @Test
    public void shouldNotReturnNullWhenAHelloWorld() {

        String response = subject.helloWorld();
        Assertions.assertThat(response).isNotNull();
    }
}