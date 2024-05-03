package com.cydeo.test.java.utils;

import com.microsoft.playwright.Page;

public class BrowserUtils {
    public static void sleepWithThread(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (Exception e) {

        }
    }
        public static void sleepWithPage(Page page,int second){
        page.waitForTimeout(second*1000);
        }
}
