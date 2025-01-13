package com.Selenium4xPractice.SeleniumBasics.Seleniumxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

   //Core Logic - //tagName[@attribute='value']

public class TypesofXpath {

    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver =new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();

        //Way1:
        driver.findElement(By.xpath("//a[@id ='btn-make-appointment']")).click();
        //way 2
       // driver.findElement(By.xpath("//a[text() ='Make Appointment']")).click();
        //way 3
        //driver.findElement(By.xpath("//a[@href=\"./profile.php#login\"]")).click();

    }

}
