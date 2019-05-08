package com.example.testTdd.controller;

import com.example.testTdd.service.IHelloWorldService;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class HelloWorldControllerTest {

    /**
     * subject under testing
     */
    private HelloWorldController subject;
    private IHelloWorldService helloWorldService;


    @Before
    public void setUp() throws Exception {

        helloWorldService = Mockito.mock(IHelloWorldService.class);

        subject= new HelloWorldController(helloWorldService);
    }

    @Test
    public void shouldNotReturnNullWhenAHelloWorld() {

        String response = subject.helloWorld();
        Assertions.assertThat(response).isNotNull();
    }

    @Test
    public void shouldCallService() {

        String response = subject.helloWorld();
        verify(helloWorldService).returnHelloMessage();
    }
}