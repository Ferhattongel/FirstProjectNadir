package com.cydeo.test.ExtraPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFunctionalities {

    public static void loginCredentialsInput(WebDriver driver, String invalidPassword, String validUsername){

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
    public static void checkTitle(WebDriver driver, String expectedTitle){
        String title=driver.getTitle();


        if(title.contains(expectedTitle)){
            System.out.println("TC001 VALID LOGIN CASE SUCCESSFUL");
        }else{
            System.out.println("TC001 VALID LOGIN CASE FAILED");
        }
    }
}



