package com.cydeo.test.java.day_01.pac_03_css_xpath;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.Test;

public class P01_Locators {
    @Test
    public void test1() {
        Playwright playwright = Playwright.create();
        BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://login1.nextbasecrm.com/");
        page.querySelector("[name=USER_LOGIN]").fill("market");
        page.querySelector("[name='USER_PASSWORD']").fill("incorectpassword");
        page.querySelector(".login-btn").click();
String errorMessage=page.querySelector(".errortext").textContent();
        System.out.println(errorMessage);
        page.close();
        browser.close();
        playwright.close();




    }
    }
