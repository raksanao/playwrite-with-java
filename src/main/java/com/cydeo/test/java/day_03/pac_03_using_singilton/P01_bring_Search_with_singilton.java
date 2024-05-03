package com.cydeo.test.java.day_03.pac_03_using_singilton;

import com.cydeo.test.java.utils.BrowserUtils;
import com.cydeo.test.java.utils.ConfigurationReader;
import com.cydeo.test.java.utils.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P01_bring_Search_with_singilton {

    @Test
    void bing_search_1() {

        Driver.getPage().navigate(ConfigurationReader.getProperty("bingURL"));

        BrowserUtils.sleepWithThread(3);
    //    Driver.getPage().getByTestId("bnp_btn_accept").click();

        BrowserUtils.sleepWithThread(3);


        Driver.getPage().getByTestId("sb_form_q").fill("playwright");

        Driver.getPage().getByTestId("sb_form_q").press("Enter");

        Assertions.assertTrue(Driver.getPage().title().contains("playwright"));

        //bnp_btn_accept
        BrowserUtils.sleepWithThread(3);
        Driver.closeDriver();
    }
}