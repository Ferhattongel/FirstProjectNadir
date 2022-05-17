package com.cydeo.test.ExtraPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

    public static void loginInvalidPassword(String validUsername, String invalidPassword){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login.nextbasecrm.com/");

        WebElement login= driver.findElement(By.name("USER_LOGIN"));
        login.sendKeys(validUsername);

        WebElement pass= driver.findElement(By.name("USER_PASSWORD"));
        pass.sendKeys(invalidPassword+ Keys.ENTER);




        System.out.println();
        driver.close();

    }
}



