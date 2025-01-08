package com.Selenium4xPractice.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task31Dec_Verifymessage {

    public static void main(String[] args) throws InterruptedException {

        FirefoxDriver driver =new FirefoxDriver();
        driver.get("https://www.idrive360.com/enterprise/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.id("username")).sendKeys("augtest_040823@idrive.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("frm-btn")).click();

        //Verify that the free trial message is visible.
        //need to visible text "Your free trial has expired" //

        //driver.findElement(By.class("id-card-title"));
        //System.out.println(Isdisplayed: "Your free trial has expired");

    }

}
