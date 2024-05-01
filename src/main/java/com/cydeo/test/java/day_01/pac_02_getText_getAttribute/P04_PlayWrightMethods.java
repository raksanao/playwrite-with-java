package com.cydeo.test.java.day_01.pac_02_getText_getAttribute;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import org.junit.Test;

public class P04_PlayWrightMethods {
    @Test
    public void test2() {
        Playwright playwright = Playwright.create();
        BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://library2.cybertekschool.com/login.html");
        //first option page.getByPlaceholder("email address").fill("email.com");
//second option works with any case sensetivity
         Locator emailAddress= page.getByPlaceholder("Email address");
       emailAddress.fill("cydeo.com");
//third option it finds exact same word
      //  page.getByPlaceholder("Email address",new Page.GetByPlaceholderOptions().setExact(true)).fill("email.com");
page.getByLabel("Password").fill("incorectPassword");
//page.click("Signin");

        page.getByRole(AriaRole.BUTTON).click();
      //  System.out.println(page.getByRole(AriaRole.ALERT).isVisible());
        System.out.println(page.getByRole(AriaRole.ALERT).textContent());
     //   System.out.println(page.getByRole());
        System.out.println(page.getByRole(AriaRole.ALERT).isVisible());

        page.waitForTimeout(3000);




        page.close();
        browser.close();
        playwright.close();
    }
}
