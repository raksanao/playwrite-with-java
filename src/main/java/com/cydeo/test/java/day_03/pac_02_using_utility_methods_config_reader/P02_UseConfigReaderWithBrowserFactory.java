package com.cydeo.test.java.day_03.pac_02_using_utility_methods_config_reader;

import com.cydeo.test.java.utils.BrowserFactory;
import com.cydeo.test.java.utils.CRMUtils;
import com.cydeo.test.java.utils.ConfigurationReader;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.*;

public class P02_UseConfigReaderWithBrowserFactory {
    static private Playwright playwright;

    static private Browser browser;

    private Page page;

    @BeforeAll
    static void beforeAll() {
        playwright = Playwright.create();

        String browserFromConfig = ConfigurationReader.getProperty("browser");

        browser= BrowserFactory.getBrowser(browserFromConfig, playwright);

        System.out.println("browserFromConfig = " + browserFromConfig);



    }


    @AfterAll
    static void afterAll() {

        browser.close();
        playwright.close();
    }


    @BeforeEach
    void setUp() {
        page = browser.newContext().newPage();
    }

    @AfterEach
    void tearDown() {
        page.close();
    }

    @Test
    void test1() {

        page.navigate(ConfigurationReader.getProperty("googleUrl"));
    }

    @Test
    void test2() {
        CRMUtils.login(page, "marketing1@cydeo.com", "UserUser");

    }
    }