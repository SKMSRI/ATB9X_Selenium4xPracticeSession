package com.Selenium4xPractice.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Task_03Jan_printtablerecords {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        Thread.sleep(5000);
        driver.manage().window().maximize();


        // Find the xPath for the WebTable
        // -> //table[@summary="Sample Table"]

        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));


        // rows and columns
        List<WebElement> rows_tables = table.findElements(By.tagName("tr"));

        for( int i=0; i <rows_tables.size();i++){
            List<WebElement> col = rows_tables.get(i).findElements(By.tagName("td"));
            for(WebElement c: col){
                System.out.println(c.getText());
            }
        }
    }

}


