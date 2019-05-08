package com.example.testTdd.service.impl;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldServiceImplTest {

    /**
     * subject under testing
     */
    private HelloWorldServiceImpl subject;


    @Before
    public void setUp() throws Exception {

        subject = new HelloWorldServiceImpl();
    }

    @Test
    public void shouldNotReturnNullMessage() {

        String response = subject.returnHelloMessage();
        Assertions.assertThat(response).isNotNull();
    }
}