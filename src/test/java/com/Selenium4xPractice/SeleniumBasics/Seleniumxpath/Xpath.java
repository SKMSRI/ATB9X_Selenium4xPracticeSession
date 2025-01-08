package com.Selenium4xPractice.SeleniumBasics.Seleniumxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.List;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();

        WebElement make_appointment_btn = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_appointment_btn.click();


        // WITH THE ID
        //        WebElement username_input_box = driver.findElement(By.xpath("//input[@id='txt-username']"));
        //        username_input_box.sendKeys("John Doe");


        List<WebElement> username_input_box = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username_input_box.get(1).sendKeys("John Doe");

        List<WebElement> password_input_box = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        password_input_box.get(1).sendKeys("ThisIsNotAPassword");

        WebElement login_input_box = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        login_input_box.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        Thread.sleep(5000);
        driver.quit();
        // It will close all the tabs. - session id == null

    }

}
