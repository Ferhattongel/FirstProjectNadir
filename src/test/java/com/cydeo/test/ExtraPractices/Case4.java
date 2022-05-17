package com.cydeo.test.ExtraPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login.nextbasecrm.com/");
        Thread.sleep(2000);

        WebElement login= driver.findElement(By.name("USER_LOGIN"));
        login.sendKeys("invalidUserName@cybertekschool.com");
        //INVALID EMAIL

        WebElement pass= driver.findElement(By.name("USER_PASSWORD"));
        pass.sendKeys("UserUser"+ Keys.ENTER);
        //VALID USERNAME - Then click the button


        WebElement msg=driver.findElement(By.className("errortext"));
        //Created msg web element to find class name.
           String actual= msg.getText();
           String expected="Incorrect login or password";
        //Created actual result , and expected result

           if (actual.equals(expected)){
               System.out.println("TEST CASE PASSED");
           }else{
               System.out.println("Test Case FAILED");
           }
          //test case passed


        Thread.sleep(3000);
        driver.close();




    }
}
