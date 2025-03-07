package com.Selenium4xPractice.SeleniumBasics.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsConcept {
    public static void main(String[] args) throws InterruptedException {

        FirefoxDriver driver =new FirefoxDriver();
        driver.get(" https://katalon-demo-cura.herokuapp.com");
        driver.findElement(By.id("btn-make-appointment")).click();
        Thread.sleep(5000);


        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();

        System.out.println(driver.getCurrentUrl());

    }
}
