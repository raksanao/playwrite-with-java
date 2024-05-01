package com.cydeo.test.java.day_02.pac_01_multipleElements_checkbox_radio;

import com.cydeo.test.java.day_02.utils.BrowserUtils;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import org.junit.Test;

public class P05_RadioButtons {
    @Test
    public void test1(){
        Playwright playwright=Playwright.create();
        Browser  browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page=browser.newPage();
        page.navigate("https://practice.cydeo.com/radio_buttons");

//page.getByRole(AriaRole.BUTTON,new Page.GetByRoleOptions().setName("Red")).check();
        Locator hockey=page.getByRole(AriaRole.RADIO,new Page.GetByRoleOptions().setName("Hockey"));

        BrowserUtils.sleepWithThread(3);
        System.out.println(hockey.isChecked());
        BrowserUtils.sleepWithThread(5);
        hockey.check();
        System.out.println(hockey.isChecked());
        page.close();
        browser.close();
        playwright.close();
    }
}
