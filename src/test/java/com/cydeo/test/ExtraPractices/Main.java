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
        String expectedTitle="Portal";
         /*
    Test Case 1:
        Given I am on NextBaseCRM Login page
        When I enter valid help desk username
        And I enter valid help desk password
        And I click log in button
        Then I should see help desk account logged in

    */
        LoginFunctionalities.loginCredentialsInput(driver, validPassword,validUsername);
        LoginFunctionalities.checkTitle(driver,expectedTitle);
    /*
    test Case 2
        Given I am on NextBaseCRM Login page
        When I enter valid help desk username
        And I enter invalid help desk password
        And I click log in button
        Then I should see error message
     */
        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://login.nextbasecrm.com/");

        LoginFunctionalities.loginCredentialsInput(driver2, invalidPassword,validUsername);

        LoginFunctionalities.checkErrorMSG(driver2, expected);



    }



}
