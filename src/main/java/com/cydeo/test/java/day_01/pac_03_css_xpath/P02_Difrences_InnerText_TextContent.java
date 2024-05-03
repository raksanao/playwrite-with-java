package com.cydeo.test.java.day_01.pac_03_css_xpath;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;


public class P02_Difrences_InnerText_TextContent {
    @Test
    public void test1() {
        Playwright playwright = Playwright.create();
        BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("http://localhost:63343/playwrite-with-java/com/cydeo/test/resources/getText.html?_ijt=1av3g04r3n3l50csa2beeabcej&_ij_reload=RELOAD_ON_SAVE");
 String textContent=  page.querySelector("#example").textContent();
  String innerText=page.querySelector("#example") .innerText();
        System.out.println(textContent);
        System.out.println(innerText);


        page.close();
        browser.close();
        playwright.close();


    }
    }
