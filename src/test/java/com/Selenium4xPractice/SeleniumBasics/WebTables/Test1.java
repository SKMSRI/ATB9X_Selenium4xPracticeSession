package com.Selenium4xPractice.SeleniumBasics.WebTables;

import org.openqa.selenium.edge.EdgeDriver;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver =new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        Thread.sleep(5000);
        driver.manage().window().maximize();
    }
}
