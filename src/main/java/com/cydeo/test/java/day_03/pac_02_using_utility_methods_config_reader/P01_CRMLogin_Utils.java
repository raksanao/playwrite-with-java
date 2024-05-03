package com.cydeo.test.java.day_03.pac_02_using_utility_methods_config_reader;

import com.cydeo.test.java.utils.CRMUtils;
import com.cydeo.test.java.utils.ConfigurationReader;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.*;

public class P01_CRMLogin_Utils {
    static private Playwright playwright;

    static private Browser browser;

    private Page page;

    @BeforeAll
    static void beforeAll() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                .setHeadless(false)

        );
    }


    @AfterAll
    static void afterAll() {

        browser.close();
        playwright.close();
    }


    @BeforeEach
    void setUp() {
        page = browser.newContext().newPage();
        page.navigate("https://login2.nextbasecrm.com/");
    }

    @AfterEach
    void tearDown() {
        page.close();
    }


    @Test
    void test1() {

        CRMUtils.login(page);


    }

    @Test
    void test2() {
        CRMUtils.login(page,"marketing1@cydeo.com","UserUser");


}    }