package com.Selenium4xPractice.SeleniumBasics.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CSSSelectors {
    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver =new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();



        driver.findElement(By.xpath("//img[@title ='Flipkart']"));
        //In CSS selector --> CSS [attribute=value] Selector - contains
        //Remove // & @ then input[title ='Flipkart']

        driver.findElement(By.cssSelector("img[title ='Flipkart']"));
    }
}
