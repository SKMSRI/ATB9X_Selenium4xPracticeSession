package com.Selenium4xPractice.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Task_03Jan_WebTables {

    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@name ='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//button[@type ='submit']")).click();


        int row = driver.findElements(By.xpath("//div[@class='oxd-table-body']/div")).size();
        int col = driver.findElements(By.xpath("//div[@class='oxd-table-body']/div[4]/div/div")).size();
        System.out.println(row);
        System.out.println(col);
        //xpath of a cell = //div[@class='oxd-table-body']/div[4]/div/div[3]
        String first_part = "//div[@class='oxd-table-body']/div[";
        String sec_part = "]/div/div[";
        String third_part = "]";
        for (int i = 1; i < row; i++) {
            for (int j = 2; j < col - 1; j++) { // since last column is not required
                String dynamic_path = first_part + i + sec_part + j + third_part;
                String data = driver.findElement(By.xpath(dynamic_path)).getText();
                System.out.println(data);
            }
        }

    }
}
