package com.Selenium4xPractice.SeleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebDriver01 {

    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
    }
}
