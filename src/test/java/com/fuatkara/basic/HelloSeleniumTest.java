package com.fuatkara.basic;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSeleniumTest {

    @Test
    public void firstTest(){

        //Set location of chromedriver
        System.setProperty("webdriver.chrome.driver","resources/windows/chromedriver.exe");

        //Start session (open browser)
        WebDriver driver = new ChromeDriver();

        //Navigate
        driver.get("http://www.google.com.tr");

        //Find Element
        driver.findElement(By.id("sign-in"));

        //Quit session (closes browser)
        driver.quit();
    }
}



