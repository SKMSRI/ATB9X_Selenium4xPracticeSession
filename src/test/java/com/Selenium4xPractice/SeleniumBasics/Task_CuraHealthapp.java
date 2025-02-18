package com.Selenium4xPractice.SeleniumBasics;


import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Task_CuraHealthapp {

    //public static void main(String[] args) throws InterruptedException {
    @Test
    public void LoginPage_TestCase1() {
        EdgeDriver driver = new EdgeDriver();
        driver.get(" https://katalon-demo-cura.herokuapp.com");
        driver.findElement(By.id("btn-make-appointment")).click();
        //Thread.sleep(5000);

        //Login_TestCase1
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();
        System.out.println(driver.getCurrentUrl());
        //Action events

        //Dropdown_TestCase2
        Select Facility = new Select(driver.findElement(By.name("facility")));
        //Facility.selectByIndex(2);
        Facility.selectByContainsVisibleText("Seoul CURA Healthcare Center");

        //checkbox_TestCase3
        driver.findElement(By.name("hospital_readmission")).click();

        //RadioButton_Testcase4
        driver.findElement(By.xpath("//input[contains(@id, 'radio_program_medicaid')]")).click();

        //DatePick_Testcase5


    }
}
