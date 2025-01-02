package com.Selenium4xPractice.SeleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebDriver01 {

    public static void main(String[] args) throws InterruptedException {

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }
}
