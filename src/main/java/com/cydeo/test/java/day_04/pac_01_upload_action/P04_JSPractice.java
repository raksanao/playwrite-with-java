package com.cydeo.test.java.day_04.pac_01_upload_action;

import com.cydeo.test.java.utils.BrowserUtils;
import com.cydeo.test.java.utils.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class P04_JSPractice {
    @BeforeEach
    void setUp(){
        Driver.getPage().navigate("https://practice.cydeo.com/infinite_scroll");

    }
    @AfterEach
    void tearDown() {

        BrowserUtils.sleepWithThread(3);

        Driver.closeDriver();
    }


    @Test
    void test1() {
        for (int i = 0; i < 100; i++) {


            Driver.getPage().evaluate("window.scrollBy(0,500");
            BrowserUtils.sleepWithThread(1);
        }
    }
    }
