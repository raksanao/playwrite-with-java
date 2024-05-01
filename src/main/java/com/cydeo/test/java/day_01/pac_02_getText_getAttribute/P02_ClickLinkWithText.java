package com.cydeo.test.java.day_01.pac_02_getText_getAttribute;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.Assert;
import org.junit.Test;

public class P02_ClickLinkWithText {
    @Test
    public void test2() {
        Playwright playwright = Playwright.create();
        BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
page.navigate("https://practice.cydeo.com");
//page.setViewportSize(1920,1080);
 page.click("text=A/B Testing");
        System.out.println(page.title());
        page.waitForTimeout(3000);
 page.goBack();
        page.waitForTimeout(3000);
 page.click("text=Checkboxes");
        System.out.println(page.title());
 page.waitForTimeout(3000);

        page.close();
        browser.close();
        playwright.close();
    }
}