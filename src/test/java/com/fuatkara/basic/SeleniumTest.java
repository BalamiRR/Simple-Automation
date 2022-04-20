package com.fuatkara.basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumTest {
    @BeforeClass
    public static void setupClass(){
        WebDriverManager.edgedriver().setup();
    }

    @Test
    public void safariTest() throws InterruptedException{
        WebDriver driver = new SafariDriver();
        driver.get("https://example.cypress.io");
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void cypressTest() throws InterruptedException{
        WebDriver driver = new SafariDriver();
        driver.get("https://www.linkedin.com/in/fuat-kara");
        Thread.sleep(3000);
        driver.quit();
    }


}
