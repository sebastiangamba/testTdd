package com.example.testTdd.controller;

import com.example.testTdd.service.IHelloWorldService;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class HelloWorldControllerTest {

    private static final String TEST_NAME = "bleh";
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

        String response = subject.helloWorld(TEST_NAME);
        Assertions.assertThat(response).isNotNull();
    }

    @Test
    public void shouldCallService() {

        String response = subject.helloWorld(TEST_NAME);
        verify(helloWorldService).returnHelloMessage();
    }

    @Test
    public void shouldSayHelloToNameWhenHelloWorld() {

        String name = "pepe";
        Mockito.when(helloWorldService.returnHelloMessage()).thenReturn("asdasd"+name);
        String response = subject.helloWorld(name);
        Assertions.assertThat(response).contains(name);
    }
}