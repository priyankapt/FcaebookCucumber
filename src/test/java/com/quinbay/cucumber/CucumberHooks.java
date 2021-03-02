package com.quinbay.cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CucumberHooks {
    @Before
    public void testBefore(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/login/web/");
        System.out.println("This is a demo of before hook");
    }
    @After
    //webDriver driver;
    public void testAfter(){

        System.out.println("This is a demo of after hook");

    }
}
