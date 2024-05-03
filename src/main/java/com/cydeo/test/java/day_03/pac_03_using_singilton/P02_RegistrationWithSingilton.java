package com.cydeo.test.java.day_03.pac_03_using_singilton;

import com.cydeo.test.java.utils.BrowserUtils;
import com.cydeo.test.java.utils.ConfigurationReader;
import com.cydeo.test.java.utils.Driver;
import org.junit.jupiter.api.Test;

public class P02_RegistrationWithSingilton {
    @Test
    public  void test1(){
        Driver.getPage().navigate(ConfigurationReader.getProperty("register"));
Driver.getPage().locator("//*[@name='firstname']").fill("Raksana");

        Driver.getPage().locator("//*[@name='lastname']").fill("olim");
        Driver.getPage().locator("//*[@name='username']").fill("ruxolim");
        Driver.getPage().locator("//*[@name='email']").fill("ruxolim@gmail.com");
        Driver.getPage().locator("//*[@name='password']").fill("weraaa");
        Driver.getPage().locator("//*[@name='phone']").fill("347-359-3978");
Driver.getPage().check("(//*[@name='gender'])[2]");
        Driver.getPage().locator("//*[@name='birthday']").fill("01/09/2019");
     BrowserUtils.sleepWithThread(1);
        Driver.getPage().locator("//*[@name='department']").selectOption("Accounting Office");

        Driver.getPage().locator("//*[@name='job_title']").selectOption("Developer");

        Driver.getPage().locator("(//*[@type='checkbox'])[1]").click();
Driver.getPage().getByTestId("wooden_spoon").click();
        BrowserUtils.sleepWithThread(1);
        Driver.closeDriver();
    }
}
