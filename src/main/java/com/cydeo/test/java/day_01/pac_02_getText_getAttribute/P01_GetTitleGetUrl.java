package com.cydeo.test.java.day_01.pac_02_getText_getAttribute;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class P01_GetTitleGetUrl {


    @Test
  public  void test1(){
        Playwright playwright=Playwright.create();
        BrowserType chromium=playwright.chromium();
        Browser browser= chromium.launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page=browser.newPage();
        page.navigate("https://practice.cydeo.com/");
page.url();
        System.out.println(page.url());
  Assertions.assertTrue(page.url().contains("cydeo"));
      Assertions.assertEquals("Practice",page.title());
        System.out.println(page.title());
page.waitForTimeout(3000);
        page.close();
        browser.close();
        playwright.close();
    }

}
