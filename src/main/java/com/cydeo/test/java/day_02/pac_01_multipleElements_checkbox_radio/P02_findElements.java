package com.cydeo.test.java.day_02.pac_01_multipleElements_checkbox_radio;

import com.cydeo.test.java.utils.BrowserUtils;
import com.microsoft.playwright.*;

import org.junit.jupiter.api.Test;

import java.util.List;

public class P02_findElements {
    @Test
    public void name(){
        Playwright playwright=Playwright.create();
    Browser browser=playwright.chromium().
            launch(new BrowserType.LaunchOptions().setHeadless(true));
        Page page=browser.newPage();

        page.navigate("https://practice.cydeo.com/abtest");
     List<ElementHandle> allLinks=page.querySelectorAll("//a");
     for(ElementHandle each:allLinks){
         System.out.println( each.getAttribute("href"));

     }
        BrowserUtils.sleepWithPage(page,3);
        page.close();

        browser.close();
        playwright.close();
    }
}
