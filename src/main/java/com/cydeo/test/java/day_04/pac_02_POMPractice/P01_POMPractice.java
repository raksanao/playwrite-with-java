package com.cydeo.test.java.day_04.pac_02_POMPractice;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.test.java.utils.BrowserUtils;
import com.cydeo.test.java.utils.Driver;
import com.microsoft.playwright.Locator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class P01_POMPractice {
 LibraryLoginPage libraryLoginPage=new LibraryLoginPage();
    @BeforeEach
    void setUp(){
        Driver.getPage().navigate("https://library1.cydeo.com/");

libraryLoginPage= new LibraryLoginPage();

    }
    @AfterEach
    void tearDown() {

        BrowserUtils.sleepWithThread(3);

        Driver.closeDriver();
    }


    @Test
    void test1() {
        libraryLoginPage.getEmailInput().fill("invailid");
        libraryLoginPage.getPasswordInput().fill("invailid");
    libraryLoginPage.getSignInButton().click();
    }

}
