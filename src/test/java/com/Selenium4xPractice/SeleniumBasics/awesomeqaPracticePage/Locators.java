package com.Selenium4xPractice.SeleniumBasics.awesomeqaPracticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //Text box
        driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("SAURABH");
        driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("SRIVASTAVA");

        //Radio button
        driver.findElement(By.xpath("//input[contains(@id,'sex-0')]")).click();
        driver.findElement(By.xpath("//input[contains(@id,'exp-4')]")).click();

        //text box for date
        driver.findElement(By.xpath("//input[contains(@id, 'datepicker')]")).sendKeys("29-Jan-2025");

        //checkbox
        driver.findElement(By.xpath("//input[contains(@value,'Automation Tester')]")).click();
        driver.findElement(By.xpath("//input[contains(@value,'Selenium Webdriver')]")).click();




    }
}
