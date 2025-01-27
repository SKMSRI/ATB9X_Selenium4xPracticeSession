package com.Selenium4xPractice.SeleniumBasics.awesomeqaPracticePage;

import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);



    }
}
