package com.cydeo.test.java.day_04.pac_01_upload_action;

import com.cydeo.test.java.utils.BrowserUtils;
import com.cydeo.test.java.utils.Driver;
import com.microsoft.playwright.ElementHandle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class P05_ScrallingView {
    @BeforeEach
    void setUp(){
        Driver.getPage().navigate("https://practice.cydeo.com");

    }
    @AfterEach
    void tearDown() {

        BrowserUtils.sleepWithThread(3);

        Driver.closeDriver();
    }


    @Test
    void test1() {


        ElementHandle cydeoLink=Driver.getPage().querySelector("text=CYDEO");
        ElementHandle homeLink=Driver.getPage().querySelector("text=HOME");
BrowserUtils.sleepWithThread(3);
cydeoLink.scrollIntoViewIfNeeded();
BrowserUtils.sleepWithThread(3);
homeLink.scrollIntoViewIfNeeded();


    }
}
