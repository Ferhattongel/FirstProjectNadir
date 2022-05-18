package com.cydeo.test.ExtraPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case3 {
    /*Test Case #3
Test data: helpdesk51@cybertekschool.com
Category: Negative Test Case
Environment: https://login2.nextbasecrm.com/auth/?backurl=%2Fstream%2F

Given I am on NextBaseCRM Login page
When I enter invalid help desk username
And I enter invalid help desk password
And I click log in button
Then I should see error message

     */

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login2.nextbasecrm.com/auth/?backurl=%2Fstream%2F");
        Thread.sleep(3000);

        WebElement login = driver.findElement(By.name("USER_LOGIN"));
        login.sendKeys("invaild@cybertekschool.com");

        WebElement pass = driver.findElement(By.name("USER_PASSWORD"));
        pass.sendKeys("invaildUser"+ Keys.ENTER);


       WebElement msg = driver.findElement(By.className("errortext"));
        String expectedText = "Incorrect login or password";
        String actual = msg.getText();


        if(actual.equals(expectedText)){
            System.out.println("TC3 INVALID LOGIN CASE SUCCESSFUL");
        }else {
            System.out.println("TC3 INVALID LOGIN CASE FAILED");

            Thread.sleep(3000);
            driver.close();
        }
    }










}
