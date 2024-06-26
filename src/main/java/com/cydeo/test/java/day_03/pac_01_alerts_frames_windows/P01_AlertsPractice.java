package com.cydeo.test.java.day_03.pac_01_alerts_frames_windows;


import com.cydeo.test.java.utils.BrowserUtils;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.*;

public class P01_AlertsPractice {
    static private Playwright playwright;

    static private Browser browser;

    private Page page;

    @BeforeAll
    static void beforeAll() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                .setHeadless(false)
                .setSlowMo(1000)
        );
    }


    @AfterAll
    static void afterAll() {

        browser.close();
        playwright.close();
    }


    @BeforeEach
    void setUp() {
        page = browser.newPage();
        page.navigate("https://practice.cydeo.com/javascript_alerts");
    }

    @AfterEach
    void tearDown() {
        page.close();
    }


    @Test
   public void test1() {



        //we need to use before in that example we have only one option then playwriht will handle with out this line
        page.onceDialog(d -> d.accept());

        page.locator("button")
                //.nth(0)
                .first().click();


        String s = page.locator("#result").textContent();


        System.out.println("s = " + s);


    }


    @Test
   public void test2() {


        page.onceDialog(d->d.accept());

        //   page.locator("//button[.='Click for JS Confirm']");

        page.getByRole(AriaRole.BUTTON,new Page.GetByRoleOptions().setName("Click for JS Confirm")).click();



        String s = page.locator("#result").textContent();


        System.out.println("s = " + s);

    }
    @Test
    public void test3(){
     page.onceDialog(dialog -> dialog.accept("test"));
        BrowserUtils.sleepWithThread(5);
        page.locator("button")
                //.nth(0)
                .last().click();
        BrowserUtils.sleepWithThread(5);
        String s = page.locator("#result").textContent();


        System.out.println("s = " + s);

    }
}