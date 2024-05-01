package com.cydeo.test.java.day_01.pac_01_playwrite_intro;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class P001_PlayWriteTest {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright=Playwright.create();
        BrowserType chromium=playwright.chromium();
      Browser browser= chromium.launch(new BrowserType.LaunchOptions().setHeadless(false));
      Page page=browser.newPage();
      page.navigate("https://google.com");

   Thread.sleep(3000);
   page.close();
 browser.close();
 playwright.close();

    }

}
