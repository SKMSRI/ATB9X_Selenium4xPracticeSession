package com.Selenium4xPractice.SeleniumBasics.Seleniumxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpath {
    public static void main(String[] args) throws InterruptedException {

        //Core Logic - //tagName[@attribute='value']

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://practicesoftwaretesting.com");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Thread.sleep(5000);
        // xpath--for text
        driver.findElement(By.xpath("//h5 [text() = ' Combination Pliers ']")).click();
        Thread.sleep(5000);
        driver.navigate().back();

        driver.findElement(By.xpath("//a [text()='Sign in']")).click();
        driver.findElement(By.xpath("//a[contains(@aria-label, 'Register your account')]")).click();

        //by contains
        driver.findElement(By.xpath("//input [contains (@id , 'first_name')]")).sendKeys("SAURABH");
        driver.findElement(By.xpath("//input [contains(@data-test , 'last-name')]")).sendKeys("SRIVASTAVA");

        //by using starts-with
        driver.findElement(By.xpath("//input [starts-with(@id , 'address')]")).sendKeys("Bengaluru");
        driver.findElement(By.xpath("//input[starts-with(@id,'postcode')]")).sendKeys("560077");

        //by unsing and operator
        //driver.findElement(By.xpath("//input[contains(@id, 'city'and  @data-test, 'City')]")).sendKeys("Bengaluru");
        driver.findElement(By.xpath("//input[contains(@id, 'city')]")).sendKeys("Bengaluru");
        Thread.sleep(5000);
        driver.quit();
    }
}
