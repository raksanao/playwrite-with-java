package com.cydeo.test.java.day_01.pac_02_getText_getAttribute;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class P05_GetText_GetAtribute {


    @Test
    public void test2() {
        Playwright playwright = Playwright.create();
        BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://practice.cydeo.com/registration_form");
      //  System.out.println(page.getByRole("Registration Form"));
        System.out.println(page.getByRole(AriaRole.HEADING).textContent());
       String actualTytle=page.getByRole(AriaRole.HEADING).textContent();
       String expectedTitle="Registration form";
    Assertions.assertEquals(actualTytle,expectedTitle);
        String placeholder=page.querySelector("//input[@name='firstname']").getAttribute("placeholder");
        System.out.println(placeholder);
        page.close();
        browser.close();
        playwright.close();
    }
}
