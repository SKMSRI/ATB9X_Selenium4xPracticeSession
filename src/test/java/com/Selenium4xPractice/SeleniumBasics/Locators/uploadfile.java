package com.Selenium4xPractice.SeleniumBasics.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class uploadfile {
    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);

         //upload file button not working
        WebElement uploadimg = driver.findElement(By.xpath("//input[contains(@type,  'file')]"));
        uploadimg.sendKeys("C:\\Users\\SAURABH\\Downloads\\zoomsample");
        System.out.println("File uploaded successfully");

    }
}
