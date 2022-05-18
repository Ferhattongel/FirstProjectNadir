package com.cydeo.test.ExtraPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

//------------------------------------------------------------------------

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.nextbasecrm.com/");


        String validUsername = "helpdesk51@cybertekschool.com";
        String invalidUsername = "invalidUsername@cybertekschool.com";

        String validPassword = "UserUser";
        String invalidPassword = "invalidPassword";
        String expected="Incorrect login or password";
         /*
    Test Case 1:

    */



    /*

    test Case 2



     */

        TestCase2.loginInvalidPassword(driver, invalidPassword,validUsername);

        TestCase2.checkErrorMSG(driver, expected);



    }



}
