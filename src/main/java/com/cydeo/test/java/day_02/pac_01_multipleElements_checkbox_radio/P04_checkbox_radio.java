package com.cydeo.test.java.day_02.pac_01_multipleElements_checkbox_radio;

import com.cydeo.test.java.day_02.utils.BrowserUtils;
import com.microsoft.playwright.*;
import org.junit.Test;

public class P04_checkbox_radio {
    @Test
    public void test1(){
        Playwright playwright=Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
      Page page= browser.newPage();
   page.navigate("https://practice.cydeo.com/checkboxes");
Locator checkbox1=page.locator("#box1");
Locator checkbox2=page.locator("#box2");

        System.out.println(checkbox1.isChecked());
        System.out.println(checkbox2.isChecked());
        BrowserUtils.sleepWithThread(2);
  checkbox1.click();
  checkbox2.check();


   page.close();
    browser.close();
    playwright.close();
    }
}
