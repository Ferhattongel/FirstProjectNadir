package com.cydeo.test.ExtraPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

    public static void loginInvalidPassword(WebDriver driver, String invalidPassword, String validUsername){

        WebElement login= driver.findElement(By.name("USER_LOGIN"));
        login.sendKeys(validUsername);

        WebElement pass= driver.findElement(By.name("USER_PASSWORD"));
        pass.sendKeys(invalidPassword+ Keys.ENTER);
    }

    public static void checkErrorMSG(WebDriver driver, String expected){
        WebElement msg=driver.findElement(By.className("errortext"));
        //Created msg web element to find class name.
        String actual= msg.getText();

        //Created actual result , and expected result

        if (actual.equals(expected)){
            System.out.println("TEST CASE PASSED");
        }else{
            System.out.println("Test Case FAILED");
        }

    }
}



