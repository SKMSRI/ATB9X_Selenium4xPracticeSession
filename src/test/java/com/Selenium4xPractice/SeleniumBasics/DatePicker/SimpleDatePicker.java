package com.Selenium4xPractice.SeleniumBasics.DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class SimpleDatePicker {

    public static void main(String[] args) throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.globalsqa.com/demo-site/datepicker");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        // Switch to the iframe containing the Datepicker
        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();


    }
}
