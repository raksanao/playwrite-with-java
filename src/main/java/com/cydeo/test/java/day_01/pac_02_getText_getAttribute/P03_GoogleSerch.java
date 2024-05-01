package com.cydeo.test.java.day_01.pac_02_getText_getAttribute;

import com.microsoft.playwright.*;
import org.junit.Test;

public class P03_GoogleSerch {
    @Test
    public void test2() {
        Playwright playwright = Playwright.create();
        BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://google.com");
Locator searchboxElements=page.locator("textarea[name='q']");
        //searchboxElements.type("hello");
searchboxElements.pressSequentially("selenium",new Locator.PressSequentiallyOptions().setDelay(100));
Keyboard keyboard=page.keyboard();

keyboard.press("Enter");
page.waitForTimeout(3000);
        page.close();
        browser.close();
        playwright.close();
    }
    }

