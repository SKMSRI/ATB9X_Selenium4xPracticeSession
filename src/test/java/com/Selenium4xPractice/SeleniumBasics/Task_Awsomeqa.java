package com.Selenium4xPractice.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class Task_Awsomeqa {

    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();
        //Thread.sleep(5000);

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
        driver.findElement(By.xpath("//input[contains(@value,  'Manual Tester')]")).click();
        driver.findElement(By.xpath("//input[contains(@value,'Selenium Webdriver')]")).click();

        //Selct dropdown by selct method
        Select continents = new Select(driver.findElement(By.id("continents")));
        //continents.selectByVisibleText("Australia");
        continents.selectByIndex(3);

        //Select value by scrooll bropdown
        Select selenium_commands = new Select(driver.findElement(By.id("selenium_commands")));
        selenium_commands.selectByIndex(3);
        selenium_commands.selectByContainsVisibleText("Switch Commands");

        //upload file button
        //driver.findElement(By.xpath("//input[contains(@id,'photo')]")).click();
        WebElement upload = driver.findElement(By.xpath("//input[contains(@type,  'file')]"));
        upload.sendKeys("C:\\Users\\SAURABH\\Downloads\\zoomsample");
        System.out.println("File uploaded successfully");

    }
}

