package com.example.testTdd.service.impl;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
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

        String response = subject.returnHelloMessage("name");
        Assertions.assertThat(response).isNotNull();
    }

    @Test
    @UseDataProvider("validNames")
    public void shouldReturnHelloMessageWithName(String name) {
        String helloMessage = subject.returnHelloMessage(name);
        Assertions.assertThat(helloMessage).isEqualTo("Hello world " + name);
    }

    @DataProvider
    public static Object[][] validNames() {
        return new Object[][] {{ null }, {""}, {"pepe"} , {Integer.valueOf(100).toString()}};
    }
}